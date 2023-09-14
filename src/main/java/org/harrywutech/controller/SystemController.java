package org.harrywutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
