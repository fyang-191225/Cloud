package com.fyy.cloud.common.vo;

import lombok.Data;

import java.util.List;


/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:29
 */
@Data
public class PageBean<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public PageBean(){

    }
    public PageBean(long c, List<T> list){
        code=0;
        msg="OK";
        count=c;
        data=list;
    }
}
