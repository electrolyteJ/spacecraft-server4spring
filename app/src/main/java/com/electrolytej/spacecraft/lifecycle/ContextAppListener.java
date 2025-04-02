package com.electrolytej.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

public class ContextAppListener implements ApplicationListener<ApplicationContextEvent> {
    private static final String TAG="ContextAppListener";
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(TAG,"onApplicationEvent");
    }
}
