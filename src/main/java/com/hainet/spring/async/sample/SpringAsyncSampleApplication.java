package com.hainet.spring.async.sample;

import com.hainet.spring.async.sample.domain.service.RaceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringAsyncSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAsyncSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(final RaceService service) {
        return args -> {
            System.out.println("Ready, GO!");
            service.turtle();
            service.rabbit();
        };
    }
}
