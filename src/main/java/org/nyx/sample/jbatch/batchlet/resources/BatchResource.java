package org.nyx.sample.jbatch.batchlet.resources;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author
 */
@Path("/batchlet")
public class BatchResource {

    @GET
    @Path("/start")
    //http://localhost:8080/sample-jbatch-batchlet/jbacth/batchlet/start?jobName=counter
    public Response start(@QueryParam("jobName") String jobName) {
        System.out.println(jobName);
        
        JobOperator jobOperator =  BatchRuntime.getJobOperator();
        try{
        jobOperator.start(jobName, null);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("END Job");
        return Response
                .ok("End JoB")
                .build();
    }
}
