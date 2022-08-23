package com.BC32.Project1.Service.Implement;

import com.BC32.Project1.Model.Client;
import com.BC32.Project1.Service.IClientService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ClientImpl implements IClientService {

    private final CopyOnWriteArrayList<Client> clientList = new CopyOnWriteArrayList<>();

    @Override
    public Mono<Client> register(Client obj) {
        return Mono.fromRunnable(() -> clientList.add(obj));
    }

    @Override
    public Mono<Client> modify(Client obj) {
        return null;
    }

    @Override
    public Flux<Client> list() {
        return Flux.fromIterable(clientList);
    }

    @Override
    public Mono<Client> listById(Integer idClient) {
        return Flux.fromIterable(clientList)
                .filter(customer -> customer.getIdClient().equals(idClient))
                .next();
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return null;
    }
}
