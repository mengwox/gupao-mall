package org.mawenhao.goods.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mawenhao.goods.CityCodeHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Configuration
@MapperScan("org.mawenhao.goods.mapper")
public class MybatisPlusConfiguration {

    /**
     * 新的分页插件
     * 一缓和二缓遵循mybatis的规则
     * 需要设置 MybatisConfiguration#useDeprecatedExecutor = false 避免缓存出现问题(该属性会在旧插件移除后一同移除)
     *
     * @since mybatis-plus 3.4.0
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(paginationInterceptor());
//        interceptor.addInnerInterceptor(dynamicTableNameInterceptor());
        return interceptor;
    }

    private InnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor(DbType.MYSQL);
    }

    private InnerInterceptor dynamicTableNameInterceptor() {
        DynamicTableNameInnerInterceptor interceptor = new DynamicTableNameInnerInterceptor();
        CityCodeHandler handler = new CityCodeHandler();
        Set<String> dynamicTables = handler.dynamicTables();

        Map<String, TableNameHandler> map = new HashMap<>(dynamicTables.size());
        for (String table : dynamicTables) {
            map.put(table, handler);
        }
        interceptor.setTableNameHandlerMap(map);

        return interceptor;
    }
}