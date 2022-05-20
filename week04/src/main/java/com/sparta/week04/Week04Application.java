package com.sparta.week04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 해준다.
@EnableScheduling // 스프링 부트에서 스케줄러가 작동하도록 해준다.
public class Week04Application {

    public static void main(String[] args) {

        SpringApplication.run(Week04Application.class, args);
    }

}
