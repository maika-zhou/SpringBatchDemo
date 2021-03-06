package com.jobLaunch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class JobFlowStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(JobFlowStarter.class, args);
    }

}
