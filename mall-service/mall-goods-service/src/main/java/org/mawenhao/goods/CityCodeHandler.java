package org.mawenhao.goods;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.mawenhao.goods.config.RequestDataHelper;

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
      return tableNamePrefix() + tableName;
    } else {
      return tableName;
    }
  }

  private String tableNamePrefix() {
    String prefix = RequestDataHelper.getRequestData(CITY_CODE).toString();
    if (StrUtil.isBlankIfStr(prefix)) {
      return "";
    } else {
      return prefix + "_";
    }
  }

  public Set<String> dynamicTables() {
    return DYNAMIC_TABLE_MAP.keySet();
  }

  private Boolean contains(String tableName) {
    return DYNAMIC_TABLE_MAP.getOrDefault(tableName, false);
  }
}
