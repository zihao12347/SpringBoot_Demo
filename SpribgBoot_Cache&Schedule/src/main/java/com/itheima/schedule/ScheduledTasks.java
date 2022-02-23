package com.itheima.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 构建执行定时任务
 */
@Component
public class ScheduledTasks {
    private Logger logger= LoggerFactory.getLogger(ScheduledTasks.class);

    private int fixedDelayCount=1;
    private int fixedRateCount=1;
    private int cronCount=1;

    /**
     * fixedDelay属性：上一次执行玩之后，过多久再执行
     */
    //@Scheduled(fixedDelay = 1000)
    public void testFixDelay(){
        logger.info("fixedDelay:第{}几次执行testFixDelay()方法"+fixedDelayCount);
    }

    /**
     * fixedRate属性：按频率执行
     */
    //@Scheduled(fixedRate = 1000)
    public void testFixedRate(){
        logger.info("fixedRate:第{}几次执行testFixRate()方法"+fixedRateCount);
    }

    /**
     * cron表达式：指定任务在特定时间执行；
     * @Scheduled(cron="seconds minutes hours day month week (year)")
     *      * 通配符：可在所有字段中使用
     *      ？ 占位符: 在日期/星期字段中使用
     *      / :x/y特步长序列，x起始值，y增量步长值，秒中0/15：表示0，15，30，45，分钟5/15：表示5，20，35，50
     */
    @Scheduled(cron = "0/15 * * * * ?")
    public void tesCron(){
        logger.info("fixedCron:第{}几次执行tesCron()方法"+cronCount);
    }

}
