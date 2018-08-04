package com.imyhui.enums;

import lombok.Getter;

/**
 * Class PayStatusEnum
 *
 * @author lyh
 * @date 18/6/14
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
