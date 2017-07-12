package com.ecolavagem.ecolavagem.api;

import com.ecolavagem.ecolavagem.api.output.UserOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

/**
 * Created by gabriel on 11/07/17.
 */
@RestController
@RequestMapping("/user")
public class UserApi {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable int id){
        return ResponseEntity.ok(new UserOutput(){{setId(id);}});
    }
}
