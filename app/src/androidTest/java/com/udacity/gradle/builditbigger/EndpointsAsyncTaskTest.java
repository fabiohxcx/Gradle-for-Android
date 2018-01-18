package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by fabio.lagoa on 17/01/2018.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTaskListener {

    EndpointsAsyncTask asyncTask;
    String joke;
    CountDownLatch latch;

    protected void setUp() throws Exception {
        super.setUp();

        latch = new CountDownLatch(1);
        asyncTask = new EndpointsAsyncTask(this);
    }

    @Override
    public void taskCompleted(String joke) {
        this.joke = joke;
        latch.countDown();
    }

    @Test
    public void testGetJokeTask() throws InterruptedException {

        asyncTask.execute(new Pair<Context, String>(InstrumentationRegistry.getTargetContext(), null));

        latch.await(20, TimeUnit.SECONDS);

        assertNotNull(joke);

    }


}