package org.mawenhao.goods.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    /**
     * mybatis-plus自定义配置
     *
     * @param mybatisPlusInterceptor mybatis-plus 拦截器
     * @return 自定义配置
     */
    //@Bean
    public ConfigurationCustomizer configurationCustomizer(MybatisPlusInterceptor mybatisPlusInterceptor) {
        return configuration -> {
            //这里应该用来添加额外的mybatis-plus插件
            //如果添加一个已经注册的MybatisPlusInterceptor,那么这个拦截器将会生效2次
            //也就导致了如下问题:
            //SQL: SELECT  id,name,image,initial,sort  FROM brand LIMIT ? LIMIT ?
            configuration.addInterceptor(mybatisPlusInterceptor);
        };
    }
}