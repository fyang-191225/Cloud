package com.fyy.cloud.common.result;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:32
 */
public enum  ResultCode {
    OK(200),ERROR(400),NOTFOUNT(404);
    private ResultCode(int v){
        val=v;
    }
    private int val;

    public int getVal() {
        return val;
    }
}