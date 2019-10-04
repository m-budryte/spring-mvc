package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @RequestMapping(value = "/getHelloWorld")
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity<String>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
    }

}
