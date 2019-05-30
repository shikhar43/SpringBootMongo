package com.springboot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.*;

@SpringBootApplication
public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

    @PostConstruct
    public void init()
    {
        logger.info("Application started...");
    }

    public static void main(String args[]){

        logger.info("Application executed...");

        SpringApplication.run(Main.class, args);

    }
}
