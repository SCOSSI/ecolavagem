package com.ecolavagem.ecolavagem.service;

import com.ecolavagem.ecolavagem.model.entity.ClientEntity;
import com.ecolavagem.ecolavagem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gabriel on 19/07/17.
 */
@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientEntity> getClients(){
        return clientRepository.findAll();
    }

    public ClientEntity createClient(ClientEntity clientEntity){
        return clientRepository.save(clientEntity);
    }
}
