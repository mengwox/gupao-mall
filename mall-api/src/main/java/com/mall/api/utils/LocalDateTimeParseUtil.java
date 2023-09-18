package com.mall.api.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeParseUtil {
    private static final DateTimeFormatter UTC_FORMATTER = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss'Z'");

    /**
     * 将UTC+0时间,转换为UTC指定hours格式
     *
     * @param timeStr UTC+0时间字符串
     * @param hours   小时数
     * @return UTC指定hours格式
     * @throws Exception 转换异常
     */
    public static LocalDateTime parse(String timeStr, int hours) throws Exception {
        if (hours > 18 || hours < -18) {
            System.err.println("hours out of scope");
            return null;
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(timeStr);
        System.out.println("zonedDateTime:" + zonedDateTime);
        ZonedDateTime formatZonedDT = zonedDateTime.withZoneSameInstant(ZoneOffset.ofHours(hours));
        return formatZonedDT.toLocalDateTime();
    }
}
