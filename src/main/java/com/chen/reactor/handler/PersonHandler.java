package com.chen.reactor.handler;


import com.chen.reactor.pojo.db.Person;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class PersonHandler {

    @NonNull
    public Mono<ServerResponse> addPerson(ServerRequest serverRequest){
        Person person = Person.builder().id("11").name("czh").sex("男").build();
        return ServerResponse.ok().bodyValue(person);
    }
}
