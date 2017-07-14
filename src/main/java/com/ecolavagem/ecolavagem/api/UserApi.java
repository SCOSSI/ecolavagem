package com.ecolavagem.ecolavagem.api;

import com.ecolavagem.ecolavagem.api.output.UserOutput;
import com.ecolavagem.ecolavagem.model.entity.CarWasher;
import com.ecolavagem.ecolavagem.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by gabriel on 11/07/17.
 */
@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private DistanceService distanceService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable int id){
        return ResponseEntity.ok(new UserOutput(){{setId(id);}});
    }

    //Latitute e Longitude do Cel
    @RequestMapping(value = "near/{latitude}/{longitude }", method = RequestMethod.GET)
    public ResponseEntity<?> near(@PathVariable Double latitude, @PathVariable Double longitude){
        List<CarWasher> near = distanceService.near(latitude, longitude);
        return ResponseEntity.ok(near);
    }

}
