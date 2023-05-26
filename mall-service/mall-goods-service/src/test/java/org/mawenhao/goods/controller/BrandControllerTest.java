package org.mawenhao.goods.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mawenhao.common.Resp;
import org.mawenhao.goods.GoodsApplication;
import org.mawenhao.goods.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO
 *
 * @author mawenhao 2023/5/26
 */
@SpringBootTest(classes = GoodsApplication.class)
@RunWith(SpringRunner.class)
public class BrandControllerTest {
    @Autowired
    private BrandController brandController;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void get() {
        Resp<Brand> brandResp = brandController.get(0);
        System.out.println(brandResp);
    }

    @Test
    void add() {
    }

    @Test
    void modify() {
    }

    @Test
    void delete() {
    }
}