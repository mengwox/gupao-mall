package org.mawenhao.goods.jobs;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * xxl-job定时任务调度
 *
 * @author mawenhao 2023/4/19
 */
@Component
public class XxlJobScheduler {
    @XxlJob("test")
    public void test() {
        String jobParam = XxlJobHelper.getJobParam();

        System.out.println("任务参数:" + jobParam);
        String currentTime = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
        System.out.println("xxl-job demo任务执行了,时间:" + currentTime);

        XxlJobHelper.log(currentTime);
        XxlJobHelper.handleSuccess("执行成功");
    }
}