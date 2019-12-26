package com.fyy.cloud.common.util;

import com.alibaba.fastjson.JSON;
import com.fyy.cloud.common.dto.TokenDto;
import com.fyy.cloud.common.exception.TException;


/**
 * @program: EatJoke
 * @description:
 * @author: Feri
 * @create: 2019-12-25 14:37
 */
public class TokenUtil {
    //生成令牌
    public static String createToken(int uid,String phone){
        TokenDto dto=new TokenDto();
        dto.setPhone(phone);
        dto.setUid(uid);
        return JwtUtil.createJWT(JSON.toJSONString(dto));
    }
    //解析令牌
    public static TokenDto parseToken(String token) throws TException{
        String str=JwtUtil.parseJWT(token);
        if(str!=null && str.length()>0) {
            try{
                return JSON.parseObject(str, TokenDto.class);
            }catch (Exception e){
                throw new TException("令牌不合法");
            }
        }else {
            throw new TException("令牌为空");
        }
    }
}
