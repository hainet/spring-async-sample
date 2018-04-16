package com.hainet.spring.async.sample.domain.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Service
@Async
public class RaceService {

    public void rabbit() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I'm rabbit! I reached the goal at " + LocalDateTime.now());
        System.out.println("I run on " + Thread.currentThread().getName());
    }

    public void turtle() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("I'm turtle! I reached the goal at " + LocalDateTime.now());
        System.out.println("I run on " + Thread.currentThread().getName());
    }
}
