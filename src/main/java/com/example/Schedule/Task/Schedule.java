package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    //Problem 1: Write a CRON expression that runs a job every five minutes.
    @Scheduled(cron = "0 */5 * * * *")
    public void runTask() {
        // Your task logic here
        System.out.println("Task executed every 5 minutes");
    }
// Problem 2: Write a CRON expression that runs a job every hour.
@Scheduled(cron = "0 0 * * * *")
public void runTask1() {
    // Your task logic here
    System.out.println("Task executed every every hour");
}
//Problem 3: Write a CRON expression that runs a job every day at 2:30 PM.
    @Scheduled(cron = "0 30 2 * * *")
    public void runTask2() {
        // Your task logic here
        System.out.println("Task executed every day at 2:30 PM");
    }

}
