package com.electrolytej.spacecraft.controller.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/buglyinfo")
public class BuglyConstroller {
    // inject via application.properties

    @ApiOperation(value = "bugly入口", notes = "bugly入口")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping({"/", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/printbuglyinfo")
    public String printbuglyinfo(Map<String, Object> map) {

        String eventType = (String) map.get("eventType");
        System.out.println("BuglyConstroller eventType:"+eventType);
//        model.addAttribute("name", name);
        return "printbuglyinfo";
    }
}
