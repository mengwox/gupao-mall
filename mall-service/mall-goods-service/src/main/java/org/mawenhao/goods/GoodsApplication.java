package org.mawenhao.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动配置类
 *
 * @author mawenhao 2023/4/17
 */
@SpringBootApplication
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
        System.out.println("启动完毕");
    }
}