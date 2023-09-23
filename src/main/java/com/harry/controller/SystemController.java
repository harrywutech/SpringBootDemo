package com.harry.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class SystemController {

    @GetMapping("/name/id/{id}")
    public String getName(@PathVariable("id") String userId) {

        if (userId.equals("1")) {
            return "Welcome to Skill It";
        } else if (userId.equals("2")) {
            return "2";
        } else {
            return "3";
        }
    }

    @PostMapping("/user")
    public Person createUser(@RequestBody Person person) {
        person.age = person.age + 1;
        return person;
    }

//    @PostMapping(value= "/system/time")
//    public String getTime() {
//      simpleDateFormat df = new simpleDateFormat("yyyy-MM-dd HH:mm:ss");
//      String date = df.format(new Date());
//      return date;
//    }
}
