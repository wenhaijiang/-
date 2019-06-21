package com.xmcc.common;

import lombok.Getter;

import javax.management.loading.MLetContent;

@Getter  //这里是公共的定义 只需要get方法就可以了
public enum ResultEnums {

    SUCCESS(0,"成功"),
    PRODUCT_UP(0,"正常"),
    NOT_EXITS(1,"商品不存在"),
    PARAM_ERROR(1,"参数异常"),
    PRODUCT_DOWN(1,"商品下架"),
    FAIL(1,"失败");
    private int code;
    private String msg;

    ResultEnums(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
