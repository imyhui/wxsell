package com.imyhui.utils;

import com.imyhui.VO.ResultVO;

/**
 * Class ResultVOUtil
 *
 * @author lyh
 * @date 18/6/13
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO  = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
