package com.electrolytej.spacecraft;

import com.electrolytej.spacecraft.lifecycle.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String... args) {
        SpringApplication app = new SpringApplication(App.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
        app.addListeners(new StartingAppListener());
        app.addListeners(new ContextAppListener());
        app.addListeners(new PreparedAppListener());
        app.addListeners(new EnvironmentPreparedAppListener());
        app.addListeners(new ReadyAppListener());
        app.addListeners(new FailedAppListener());
        ConfigurableApplicationContext appContext = app.run(args);
        ApplicationArguments applicationArguments = appContext.getBean(ApplicationArguments.class);
        System.out.println("name:" + applicationArguments.getOptionNames());
        System.out.println("values:" + applicationArguments.getOptionValues("developer.name"));

    }

//    @Repository
//    interface UserRepo {
//        void find();
//
//        <T extends ServerResponse> Mono<T> find(ServerRequest serverRequest);
//    }
//
//    @Bean
//    public RouterFunction<ServerResponse> routerFunction(ApplicationContext ctx) {
////         new RouterFunction<ServerResponse>() {
////            @Override
////            public Mono<HandlerFunction<ServerResponse>> route(ServerRequest request) {
////               return new RequestPredicate();
////            }
////        }
////        System.out.println("hello world");
//        return RouterFunctions.route(RequestPredicates.GET("token/"),null);
//
//    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String result = WebClient.create("http://localhost:8080")
//                    .post()
//                    .uri("/fluxService")
////                    .body("Hallo")
//                    .accept(MediaType.TEXT_PLAIN)
//                    .retrieve()
//                    .bodyToMono(String.class)
//                    .block();
////            String[] beanNames = ctx.getBeanDefinitionNames();
////            Arrays.sort(beanNames);
////            for (String beanName : beanNames) {
////                System.out.println(beanName);
////            }
//
//        };
//    }


}
