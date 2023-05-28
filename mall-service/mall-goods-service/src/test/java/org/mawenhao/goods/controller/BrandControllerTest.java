package org.mawenhao.goods.controller;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mawenhao.common.Resp;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * BrandController测试类
 *
 * @author mawenhao 2023/5/28
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BrandControllerTest extends BaseTest {
    private static Integer addId;
    @Autowired
    private BrandController brandController;

    @Test
    void get() {
        Resp<Brand> resp = brandController.get(11);
        Assert.assertTrue("resp expect not null", Objects.nonNull(resp));
        Brand data = resp.getData();
        Assert.assertTrue("resp.data expect not null", Objects.nonNull(data));
        Assert.assertEquals("resp.data.id expected 11", new Integer(11), data.getId());
    }

    @Test
    @Order(1)
    void add() {
        BrandDto dto = BrandDto.builder()
                .name("小米")
                .build();
        Resp<Integer> resp = brandController.add(dto);
        Assert.assertTrue("resp expect not null", Objects.nonNull(resp));
        Assert.assertTrue("resp.data expect not null", Objects.nonNull(resp.getData()));
        addId = resp.getData();
    }

    @Test
    @Order(2)
    void modify() {
        BrandDto dto = BrandDto.builder()
                .id(addId)
                .name("红米").build();
        Resp<String> resp = brandController.modify(dto);
        Assert.assertTrue("resp expect not null", Objects.nonNull(resp));
        Assert.assertEquals("resp.data return 修改成功", "修改成功", resp.getData());
    }

    @Test
    @Order(3)
    void delete() {
        Resp<String> resp = brandController.delete(addId);
        Assert.assertTrue("resp expect not null", Objects.nonNull(resp));
        Assert.assertEquals("resp.data return 删除成功", "删除成功", resp.getData());
    }
}