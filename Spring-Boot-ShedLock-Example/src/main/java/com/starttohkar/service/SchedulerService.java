package com.starttohkar.service;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SchedulerService {

    @Scheduled(fixedRate = 2000)
    @SchedulerLock(name = "uniqueTaskName",lockAtMostFor = "5m",lockAtLeastFor = "2s")// Executes every 2 seconds
    public void executeTask() {
        //report generation
        //sending notification
        System.out.println("Executing task at: " + new Date());
    }
}