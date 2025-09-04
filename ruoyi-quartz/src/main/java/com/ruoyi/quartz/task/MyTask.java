package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

@Component
public class MyTask {
    public void runTask1() {
        System.out.println("执行了定时任务1");
    }
}
