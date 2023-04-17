package org.mawenhao;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mysql.cj.jdbc.Driver;
import org.mawenhao.config.MyConfig;
import org.mawenhao.config.MyConfig.DataSource;
import org.mawenhao.config.MyConfig.Global;
import org.mawenhao.config.MyConfig.Tables;

/**
 * mybatis-plus 3.5.0以下版本-代码生成器
 *
 * @author mawenhao 2023/4/16
 */
public class CodeGeneratorMain {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(Global.CODE_PATH);
        gc.setAuthor(Global.AUTHOR);
        gc.setOpen(Global.IS_OPEN);
        gc.setSwagger2(Global.WITH_SWAGGER);
        gc.setBaseColumnList(Global.BASE_COLUMN_LIST);
        gc.setServiceName(Global.SERVICE_NAME);
        gc.setServiceImplName(Global.SERVICE_IMPL_NAME);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(DataSource.URL);
        dsc.setDriverName(Driver.class.getName());
        dsc.setUsername(DataSource.USERNAME);
        dsc.setPassword(DataSource.PASSWORD);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(MyConfig.MODULE.NAME);
        pc.setParent(MyConfig.MODULE.PARENT);
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setChainModel(true);
        strategy.setRestControllerStyle(true);
        // 写于父类中的公共字段
        strategy.setInclude(Tables.TABLES);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}