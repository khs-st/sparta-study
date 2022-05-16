package com.sparta.week04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 해준다.
public class Week04Application {

    public static void main(String[] args) {

        SpringApplication.run(Week04Application.class, args);
    }

}
