package com.mall.api;

import com.mall.api.utils.LocalDateTimeParseUtil;
import lombok.SneakyThrows;
import org.junit.Test;

import java.time.LocalDateTime;

import static com.mall.api.utils.LocalDateTimeParseUtil.*;

public class LocalDateTimeTest {

    @Test
    @SneakyThrows
    public void testTimeZoneParse() {
        String timeStr = "2017-01-31T14:32:19Z";
        LocalDateTime localDateTime = parse(timeStr, 18);
        System.out.println(localDateTime);
    }
}
