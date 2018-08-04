package com.imyhui.enums;

import lombok.Getter;

/**
 * Class OrderStatusEnum
 *
 * @author lyh
 * @date 18/6/14
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISH(1, "完结"),
    CANCEL(2, "已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
