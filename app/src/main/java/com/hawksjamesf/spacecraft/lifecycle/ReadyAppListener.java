package com.hawksjamesf.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class ReadyAppListener implements ApplicationListener<ApplicationReadyEvent> {
    private static final String TAG="ReadyAppListener";

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(TAG,"onApplicationEvent");

    }
}
