package com.imyhui.exception;

import com.imyhui.enums.ResultEnum;

/**
 * Class SellException
 *
 * @author lyh
 * @date 18/8/4
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
