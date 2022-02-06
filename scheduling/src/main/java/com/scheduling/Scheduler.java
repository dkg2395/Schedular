package com.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
   //@Scheduled(cron = "5 *  6 * * ?")
    //@Scheduled(fixedRate = 10000)
   @Scheduled(fixedDelay = 1000, initialDelay = 8000)
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }
}