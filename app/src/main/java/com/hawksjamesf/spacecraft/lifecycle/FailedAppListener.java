package com.hawksjamesf.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class FailedAppListener implements ApplicationListener<ApplicationFailedEvent> {
    private static final String TAG="ReadyAppListener";
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(TAG,"onApplicationEvent");
    }
}
