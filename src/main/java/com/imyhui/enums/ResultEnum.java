package com.imyhui.enums;

import lombok.Getter;

/**
 * Class ResultEnum
 *
 * @author lyh
 * @date 18/8/4
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
