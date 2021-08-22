package com.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.music.dao")
public class MusicbookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicbookingApplication.class, args);
    }

}
