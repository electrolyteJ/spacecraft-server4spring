package com.hawksjamesf.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class EnvironmentPreparedAppListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    private static final String TAG="EnvironmentPreparedAppListener";
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(TAG,"onApplicationEvent");
    }
}
