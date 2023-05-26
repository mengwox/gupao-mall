package org.mawenhao.goods;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mawenhao.goods.entity.Brand;
import org.mawenhao.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基础测试类
 *
 * @author mawenhao 2023/4/20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTest {
    @Autowired
    private BrandService brandService;

    @Test
    public void testGet() {
        Brand brand = brandService.get(13);
        Assertions.assertThat(brand).isNotNull();
    }
}
