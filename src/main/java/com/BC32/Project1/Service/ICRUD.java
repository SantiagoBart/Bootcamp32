package com.BC32.Project1.Service;

import reactor.core.publisher.Flux;

import java.util.List;

public interface ICRUD<T, V> {

    T register(T obj);
    T modify(T obj);
    Flux<T> list();
    T listById(V id);
    boolean delete(V id);
}
