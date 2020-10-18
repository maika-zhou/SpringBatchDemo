package com.jobLaunch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *      引入JobLauncher，传入参数，随后run  job
 *
 *
 */
@RestController
public class JobController {

    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job paramJobLaunch;

    @RequestMapping("/job/{msg}")
    public String jobRun1(@PathVariable String msg) throws Exception {
        System.out.println("jobRun1 --------->");
        JobParameters parameters=new JobParametersBuilder()
                                        .addString("msg",msg)
                                        .toJobParameters();

        jobLauncher.run(paramJobLaunch,parameters);

        return "success";
    }

}
