package com.asiainfo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xuegangliu on 2017/11/16.
 */
@Component
@PropertySource(value = {"classpath:/systemCron.properties"},ignoreResourceNotFound=true)
public class ScheduledTest {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTest.class);

    @Scheduled(cron="${cron.test1}")
    public void task1() {
        Thread current = Thread.currentThread();
        System.out.println("定时任务1:"+current.getId());
        logger.info("ScheduledTest.task1 定时任务1:"+current.getId()+ ",name:"+current.getName());
    }

    @Scheduled(cron="${cron.test2}")
    public void task2() {

        // 间隔1分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务2:"+current.getId());
        logger.info("ScheduledTest.task2 定时任务2:"+current.getId() + ",name:"+current.getName());
    }

    @Scheduled(cron="${cron.test2}")
    public void task3() {

        // 间隔3分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务3:"+current.getId());
        logger.info("ScheduledTest.task3 定时任务3:"+current.getId()+ ",name:"+current.getName());
    }
}
