package com.BC32.Project1.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ICRUD<T, V> {

    Mono<T> register(T obj);
    Mono<T> modify(T obj);
    Flux<T> list();
    Mono<T> listById(V id);
    Mono<Void> delete(V id);
}
