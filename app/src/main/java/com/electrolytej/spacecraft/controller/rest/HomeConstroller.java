package com.electrolytej.spacecraft.controller.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/index")
public class HomeConstroller {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message;

    @ApiOperation(value = "home入口", notes = "home入口")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping({"/", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        model.put("name", message);
//        model.addAttribute("name", name);
        return "greeting";
    }
}
