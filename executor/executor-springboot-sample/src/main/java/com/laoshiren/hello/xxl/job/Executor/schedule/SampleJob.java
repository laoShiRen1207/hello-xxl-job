package com.laoshiren.hello.xxl.job.Executor.schedule;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * ProjectName:     hello-xxl-job
 * Package:         com.laoshiren.hello.xxl.job.Executor.schedule
 * ClassName:       SampleJob
 * Author:          laoshiren
 * Git:             xiangdehua@pharmakeyring.com
 * Description:
 * Date:            2020/7/30 10:49
 * Version:         1.0.0
 */
@Component
public class SampleJob {

    @XxlJob("sampleJobHandler")
    public ReturnT<String> sampleJobHandler(String param) throws Exception {
        XxlJobLogger.log("XXL-JOB, Hello World.");
        System.out.println("XXL-JOB, Hello World.");
        return ReturnT.SUCCESS;
    }

}
