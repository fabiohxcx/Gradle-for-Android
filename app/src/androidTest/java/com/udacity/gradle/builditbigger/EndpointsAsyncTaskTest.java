package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Created by fabio.lagoa on 17/01/2018.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase{

    public void testGetJokeTask() throws ExecutionException, InterruptedException {

        EndpointsAsyncTask task = new EndpointsAsyncTask();

        assertTrue(!task.execute(new Pair<Context, String>(InstrumentationRegistry.getTargetContext(), null)).get().equals(""));

    }

}