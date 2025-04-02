package com.electrolytej.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class StartingAppListener implements ApplicationListener<ApplicationStartingEvent> {
    private static final String TAG="StartingAppListener";
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        Logger logger = LoggerFactory.getLogger(StartingAppListener.class);
        logger.info(TAG,"onApplicationEvent");

    }
}
