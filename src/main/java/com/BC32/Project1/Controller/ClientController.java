package com.BC32.Project1.Controller;

import com.BC32.Project1.Model.Client;
import com.BC32.Project1.Service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class ClientController {

    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private IClientService serv;

    @GetMapping("/list")
    public ResponseEntity<Flux<Client>> getClientList(){

        Flux<Client> response = null;

        try
        {
            response = serv.list();
        }
        catch (Exception ex) {
            return new ResponseEntity<Flux<Client>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        finally {
            logger.info("getClientList - Fin de controller");
        }

        return new ResponseEntity<Flux<Client>>(response, HttpStatus.OK);
    }
}
