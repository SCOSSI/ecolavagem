package com.ecolavagem.ecolavagem.api;

import com.ecolavagem.ecolavagem.api.output.UserOutput;
import com.ecolavagem.ecolavagem.model.entity.CarWasherEntity;
import com.ecolavagem.ecolavagem.model.entity.ClientEntity;
import com.ecolavagem.ecolavagem.service.ClientService;
import com.ecolavagem.ecolavagem.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gabriel on 11/07/17.
 */
@RestController
@RequestMapping("/client")
public class ClientApi {

    @Autowired
    private DistanceService distanceService;

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable int id){
        return ResponseEntity.ok(new UserOutput(){{setId(id);}});
    }

    //Latitute e Longitude do Cel
    @RequestMapping(value = "near/{latitude}/{longitude }", method = RequestMethod.GET)
    public ResponseEntity<?> near(@PathVariable Double latitude, @PathVariable Double longitude){
        List<CarWasherEntity> near = distanceService.near(latitude, longitude);
        return ResponseEntity.ok(near);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ClientEntity>> listAll() {
        List<ClientEntity> clients = clientService.getClients();
        if(clients.isEmpty()){
            return new ResponseEntity<List<ClientEntity>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ClientEntity>>(clients, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ClientEntity> createClient(@RequestBody ClientEntity clientEntity) {

        return new ResponseEntity<ClientEntity>(clientService.createClient(clientEntity), HttpStatus.CREATED);
    }



}
