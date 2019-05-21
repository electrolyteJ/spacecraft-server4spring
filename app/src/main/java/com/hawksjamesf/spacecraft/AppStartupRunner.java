package com.hawksjamesf.spacecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ApplicationRunner wraps the raw application arguments and exposes the ApplicationArguments interface,
 * which has many convinent methods to get arguments, like getOptionNames() to return all the arguments' names,
 * getOptionValues() to return the agrument value, and raw source arguments with method getSourceArgs().
 */
@Order(2)
@Component
public class AppStartupRunner implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Your application started with option names : {}", args.getOptionNames());
    }
}