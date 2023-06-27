package org.mawenhao.goods.controller;

import org.junit.Test;
import org.mawenhao.goods.config.RequestDataHelper;
import org.mawenhao.goods.entity.BigRoom;
import org.mawenhao.goods.service.BigRoomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import static org.mawenhao.goods.CityCodeHandler.CITY_CODE;

/**
 * 测试big-room表动态表名
 *
 * @author mawenhao
 * @since 2023/6/17
 */
public class BigRoomDynamicTableNameTest extends BaseTest {
    @Autowired
    private BigRoomService bigRoomService;

    @Test
    public void dynamicTableNameTest() {
        Integer id = 1;
        System.out.println(bigRoomService.getById(id));
        demo();
        System.out.println(bigRoomService.getById(id));
    }

    private void demo() {
        Map<String, Object> map = new HashMap<>();
        map.put(CITY_CODE, "440300");
        RequestDataHelper.setRequestData(map);
    }
}
