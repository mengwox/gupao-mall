package org.mawenhao.goods.event;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * 服务启动成功后打印提示
 *
 * @author mawenhao 2023/5/26
 */
public class ApplicationBuildSuccessTip implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("服务启动完毕");
    }
}
