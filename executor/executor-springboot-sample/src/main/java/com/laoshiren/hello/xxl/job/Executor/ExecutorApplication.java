package com.laoshiren.hello.xxl.job.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ProjectName:     hello-xxl-job
 * Package:         com.laoshiren.hello.xxl.job.Executor
 * ClassName:       ExecutorApplication
 * Author:          laoshiren
 * Git:             xiangdehua@pharmakeyring.com
 * Description:
 * Date:            2020/7/30 10:34
 * Version:         1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.laoshiren.hello.xxl.job.Executor")
public class ExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExecutorApplication.class, args);
    }

}
