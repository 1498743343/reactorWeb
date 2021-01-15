package com.chen.reactor.config;

import com.chen.reactor.handler.PersonHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Slf4j
@Configuration
public class WebConfig {
    @Bean
    RouterFunction<ServerResponse> personRouterFunction(PersonHandler handler) {
        return RouterFunctions.route().nest(
                RequestPredicates.path( "/person")
                , builder ->{
                    builder.POST("/add", handler::addPerson)
                            .build();
                }

        ).build();
    }
}
