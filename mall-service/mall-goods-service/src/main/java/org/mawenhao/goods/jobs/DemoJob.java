package org.mawenhao.goods.jobs;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * xxl-job定时任务demo
 *
 * @author mawenhao 2023/4/19
 */
@Component
public class DemoJob {
    @XxlJob("demo")
    public void demo() {
        System.out.println("任务参数:" + XxlJobHelper.getJobParam());
        String currentTime = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
        System.out.println("xxl-job demo任务执行了,时间:" + currentTime);
        XxlJobHelper.log(currentTime);
        ReturnT<String> result = ReturnT.SUCCESS;
        result.setMsg("执行成功");
    }
}
