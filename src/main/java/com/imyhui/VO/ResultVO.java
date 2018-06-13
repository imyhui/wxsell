package com.imyhui.VO;

import lombok.Data;

/**
 * Class ResultVO
 *
 * @author lyh
 * @date 18/6/12
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;
}
