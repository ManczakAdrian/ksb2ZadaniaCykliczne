package pl.manczak.ksb2zadaniacykliczne;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class Hello {



    @Schedules({
            @Scheduled(fixedDelay = 1000),
            @Scheduled (cron="0 0 12 * * ?")
    })
@Scheduled (fixedDelay = 1000)
public void sayHello()throws InterruptedException{
    Thread.sleep(3000);
    System.out.println("Hello");
}
}
