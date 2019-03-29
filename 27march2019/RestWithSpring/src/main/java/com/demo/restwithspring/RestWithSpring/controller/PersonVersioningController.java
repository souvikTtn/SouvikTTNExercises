package com.demo.restwithspring.RestWithSpring.controller;


import com.demo.restwithspring.RestWithSpring.entity.PersonV1;
import com.demo.restwithspring.RestWithSpring.entity.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//question 7
@RestController
public class PersonVersioningController {

    //URI Versioning

    @GetMapping("/person/V1")
    PersonV1 getPersonV1() {
        return new PersonV1("souvik", "chakraborty");
    }

    @GetMapping("/person/V2")
    PersonV2 getPersonV2() {
        return new PersonV2("souvik chakraborty");
    }

    //Parameter Versioning
    // /person/param?version=1
    @GetMapping(value = "/person/param",params = "version=1")
    PersonV2 getPersonParam1() {
        return new PersonV2("Peter Parker");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    PersonV1 getPersonParam2() {
        return new PersonV1("Peter","Parker");
    }


    //Header Versioning
    //API-VERSION 1 header required with request
    @GetMapping(value = "/person/header",headers = "API-VERSION=1")
    PersonV2 getPersonHeader1() {
        return new PersonV2("Peter Parker");
    }

    @GetMapping(value = "/person/header",headers = "API-VERSION=2")
    PersonV1 getPersonHeader2() {
        return new PersonV1("Peter","Parker");
    }
}
