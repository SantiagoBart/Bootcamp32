package com.BC32.Project1.Service.Implement;

import com.BC32.Project1.Model.Client;
import com.BC32.Project1.Service.IClientService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ClientImpl implements IClientService {

    private final CopyOnWriteArrayList<Client> clientList = new CopyOnWriteArrayList<>();

    @Override
    public Client register(Client obj) {
        return null;
    }

    @Override
    public Client modify(Client obj) {
        return null;
    }

    @Override
    public Flux<Client> list() {
        return Flux.fromIterable(clientList);
    }

    @Override
    public Client listById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
