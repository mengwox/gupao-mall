package org.mawenhao.goods;

import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import org.mawenhao.goods.config.RequestDataHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 城市编码-动态表名处理器
 *
 * @author mawenhao
 * @since 2023/6/17
 */
public class CityCodeHandler implements TableNameHandler {
    private static final Map<String, Boolean> DYNAMIC_TABLE_MAP;
    public static final String CITY_CODE = "cityCode";

    static {
        DYNAMIC_TABLE_MAP = new HashMap<>();
        DYNAMIC_TABLE_MAP.put("big_room", true);
        DYNAMIC_TABLE_MAP.put("big_room_detail", true);
    }

    @Override
    public String dynamicTableName(String sql, String tableName) {
        if (contains(tableName)) {
            //需要动态表名的表
            return RequestDataHelper.getRequestData(CITY_CODE).toString() + tableName;
        } else {
            return tableName;
        }
    }

    public Set<String> dynamicTables() {
        return DYNAMIC_TABLE_MAP.keySet();
    }

    private Boolean contains(String tableName) {
        return DYNAMIC_TABLE_MAP.getOrDefault(tableName, false);
    }
}
