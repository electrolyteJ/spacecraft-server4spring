package com.electrolytej.spacecraft.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class PreparedAppListener implements ApplicationListener<ApplicationPreparedEvent> {
    private static final String TAG="PreparedAppListener";
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(TAG,"onApplicationEvent");
    }
}
