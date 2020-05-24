/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nyx.sample.jbatch.batchlet.batch.batchlet;

import java.util.stream.IntStream;
import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author nyx
 */
@Dependent
@Named("BatchletCounter")
public class BatchletCounter implements Batchlet {

    @Override
    public String process() throws Exception {

        IntStream.rangeClosed(0, 10)
                .forEach(i -> System.out.println(i));

        return "COMPLETE";
    }

    @Override
    public void stop() throws Exception {

    }

}
