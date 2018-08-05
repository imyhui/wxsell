package com.imyhui.utils;

import java.util.Random;

/**
 * Class KeyUtil
 *
 * @author lyh
 * @date 18/8/4
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式: 时间+日期
     * @return
     */
    public static String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

//        retuen System.currentTimeMillis() + String.valueOf(number);
        return "";

    }
}
