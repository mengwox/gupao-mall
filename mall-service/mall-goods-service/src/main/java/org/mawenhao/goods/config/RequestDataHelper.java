package org.mawenhao.goods.config;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求参数传递辅助类
 */
@SuppressWarnings("unused, unchecked")
public class RequestDataHelper {
    /**
     * 请求参数存取
     */
    private static final ThreadLocal<Map<String, Object>> REQUEST_DATA = new ThreadLocal<>();

    /**
     * 设置请求参数
     *
     * @param requestData 请求参数 MAP 对象
     */
    public static void setRequestData(Map<String, Object> requestData) {
        REQUEST_DATA.set(requestData);
    }

    /**
     * 获取请求参数
     *
     * @param param 请求参数
     * @return 请求参数 MAP 对象
     */
    public static <T> T getRequestData(String param) {
        Map<String, Object> dataMap = getRequestData();
        return (T) dataMap.getOrDefault(param, "");
    }

    /**
     * 获取请求参数
     *
     * @return 请求参数 MAP 对象
     */
    public static Map<String, Object> getRequestData() {
        Map<String, Object> map = REQUEST_DATA.get();
        return map != null ? map : new HashMap<>();
    }
}
