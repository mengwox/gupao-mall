package org.mawenhao.goods.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * xxl-job配置文件
 *
 * @author mawenhao 2023/4/19
 */
@ConfigurationProperties(prefix = "xxl.job")
@Configuration
@RefreshScope
@Data
public class XxlJobProperties {
    private String adminAddresses;
    private String accessToken;
    private XxlJobExecutorProperties executorProperties;

    /**
     * xxl-job执行器属性配置
     */
    @Data
    public static class XxlJobExecutorProperties {
        /**
         * 执行器名称
         */
        private String appName;
        /**
         * 执行器运行日志文件存储磁盘路径 [选填] ：需要对该路径拥有读写权限；为空则使用默认路径；
         */
        private String logPath;
        /**
         * 执行器日志文件保存天数 [选填] ： 过期日志自动清理, 限制值大于等于3时生效; 否则, 如-1, 关闭自动清理功能；
         */
        private int logRetentionDays;
    }
}
