package com.fyy;

import com.fyy.cloud.common.util.EncryptUtil;
import org.junit.Test;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:27
 */
public class PassKey_Test {

    @Test
    public void pass(){
        String key= EncryptUtil.createAESKey();
        System.out.println(key);
    }
}

