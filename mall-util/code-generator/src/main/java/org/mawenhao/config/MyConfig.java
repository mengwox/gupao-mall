package org.mawenhao.config;

/**
 * 自定义配置
 *
 * @author mawenhao 2023/4/16
 */
public interface MyConfig {
    interface Tables {
        String[] TABLES = {
                "big_room"
        };
    }

    /**
     * 模块
     */
    interface MODULE {
        String NAME = "good";
        String PARENT = "org.mawenhao";
    }

    /**
     * 数据库
     */
    interface DataSource {
        String URL = "jdbc:mysql://192.168.56.150:8066/mengwox?useUnicode=true&characterEncoding=utf8&autoReconnect=true&serverTimezone=Asia/Shanghai";
        String USERNAME = "root";
        String PASSWORD = "mwh123456";
    }

    /**
     * 全局
     */
    interface Global {
        /**
         * 代码生成路径
         */
        String CODE_PATH = System.getProperty("user.dir");
        /**
         * 作者
         */
        String AUTHOR = "mawenhao";
        /**
         * 代码生成后,是否自动打开文件夹
         */
        boolean IS_OPEN = true;
        /**
         * 是否生成swagger注解
         */
        boolean WITH_SWAGGER = true;
        /**
         * 开启 baseColumnList
         */
        boolean BASE_COLUMN_LIST = true;
        String SERVICE_NAME = "%sService";
        String SERVICE_IMPL_NAME = "%sServiceImpl";
    }
}
