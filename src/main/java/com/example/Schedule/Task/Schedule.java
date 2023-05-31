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
    @Scheduled(cron = "0 30 14 * * *")
    public void runTask2() {
        // Your task logic here
        System.out.println("Task executed every day at 2:30 PM");
    }
//    Problem 4: Write a CRON expression that runs a job every Monday at 8:00 AM.
    @Scheduled(cron = "0 00 8 * * 1")
    public void runTask3() {

        System.out.println("Task executed  every Monday at 8:00 AM");
    }
//    Problem 5: Write a CRON expression that runs a job every month on the first day of the month at 3:00
//AM.
    @Scheduled(cron = "0 00 3 1 * *")
    public void runTask4() {

        System.out.println("Task executed every month on the first day of the month at 3:00 AM");

    }
//    Problem 6: Write a CRON expression that runs a job every Sunday at 7:30 PM and 10:30 PM.
    @Scheduled(cron = "0 30 19,22 * * 0")
    public void runTask5() {

        System.out.println("Task executed every Sunday at 7:30 PM and 10:30 PM");

    }
//    Problem 7: Write a CRON expression that runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.
    @Scheduled (cron = "0 */15 8-22 * * *")
    public void runTask6() {

        System.out.println("Task executed every 15 minutes between 8:00 AM and 10:45 PM every day.");

    }
//    Problem 8: Write a CRON expression that runs a job every hour on weekdays between 9:00 AM and 5:00
//PM
    @Scheduled(cron ="0 0 9-17 * * *")
    public void runTask7() {

        System.out.println("Task executed every hour on weekdays between 9:00 AM and 5:00PM");

    }
//Problem 9: Write a CRON expression that runs a job every day at 3:00 AM
    @Scheduled(cron ="0 0 3 * * *")
    public void runTask8() {

        System.out.println("Task executed every day at 3:00 AM");

    }
//Problem 10: Write a CRON expression that runs a job every hour during the month of January.
    @Scheduled(cron ="0 0 * * 1 *")
    public void runTask9() {

        System.out.println("Task executed every hour during the month of January");
    }
//    Problem 11: Write a CRON expression that runs a job every 30 minutes during business hours (8:00 AMto 5:00 PM) on weekdays.
    @Scheduled(cron ="0 */30 8-17 * * 1-5")
    public void runTask10() {

        System.out.println("Task executed every 30 minutes during business hours (8:00 AMto 5:00 PM) on weekdays.");
    }
//Problem 12: Write a CRON expression that runs a job every hour on the 15th day of the month

    @Scheduled(cron ="0 0 * 15 * *")
    public void runTask11() {

        System.out.println("Task executed every hour on the 15th day of the month");
    }
//     13: Write a CRON expression that runs a job every day at 6:00 PM during daylight saving time (DST) in the United States.
@Scheduled(cron ="0 * 18 * * *")
public void runTask12() {

    System.out.println("Task executed every day at 6:00 PM during daylight saving time (DST) in the United States");
}

//Problem 14: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.

    @Scheduled(cron ="0 */5 * * * 1-5")
    @Scheduled(cron="0 */15 * * * 6-7")
    public void runTask14() {

        System.out.println("Task executed every  5 minutes on weekdays and every 15 minutes on weekends.");
    }
//Problem 15: Write a CRON expression that runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.
@Scheduled(cron="0 */10 9-18 * * 0-4")
public void runTask15() {

    System.out.println("Task executed every  10 minutes but only between 9:00 AM and 6:00 PM on weekdays.");
}
//Problem 16: Write a CRON expression that runs a job every hour during the first half of the month.
    @Scheduled(cron = "0 0 * 1-15 * *")
    public void runTask16() {

        System.out.println("Task executed every our during the first half of the month.");
    }
//    Problem 17: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
@Scheduled(cron = "0 */5 * * * 0-4")
@Scheduled(cron = "0 */15 * * * 5-6")
public void runTask17() {

    System.out.println("Task executed every 5 minutes on weekdays and every 15 minutes on weekends");
}
//Problem 18: Write a CRON expression that runs a job at 11:30 PM every Friday the 13th.
    @Scheduled(cron = "0 30 23 13 * 5")
    public void runTask18() {

        System.out.println("Task executed runs a job at 11:30 PM every Friday the 13th");
    }
//    Problem 19: Write a CRON expression that runs a job every hour but only on even-numbered days of the month
    @Scheduled(cron = "0 0 * */2 * *")
    public void runTask19() {

        System.out.println("Task executed runs a job every hour but only on even-numbered days of the month");
    }
//    Problem 20: Write a CRON expression that runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends.
@Scheduled(cron = "0 */5 9-18 */2 * 5-6")
public void runTask120() {

    System.out.println("Task executed runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends.");
}
//Problem 21: Write a CRON expression that runs a job at 3:30 AM every day except Saturday and Sunday.
@Scheduled(cron = "0 30 3 * * 1-5")
public void runTask21() {

    System.out.println("Task executed runs a job at 3:30 AM every day except Saturday and Sunday.");
}

//Problem 22: Write a CRON expression that runs a job at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month.
    @Scheduled(cron = "0 0 9-17 15 * *")
    public void runTask22() {

        System.out.println("Task executed runs a job at 3:30 AM every day except Saturday and Sunday.");
    }


    }
