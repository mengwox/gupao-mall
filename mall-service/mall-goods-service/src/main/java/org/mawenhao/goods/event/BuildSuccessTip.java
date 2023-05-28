package org.mawenhao.goods.event;

import org.springframework.boot.CommandLineRunner;

/**
 * 服务启动成功后打印提示
 *
 * @author mawenhao 2023/5/26
 */
public class BuildSuccessTip implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("服务启动完毕");
    }
}
