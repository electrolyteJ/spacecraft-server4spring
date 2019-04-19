package com.hawksjamesf.spacecraft.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Dec/20/2018  Thu
 */
@Controller
//@ResponseBody
//@RestController
public class SignInController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message;
    @Value("${errorMsg:unknown}")
    private String errorMsg;

    @GetMapping({"/","index.html"})
    public String index() {
        return "index";
    }

    @PostMapping("/signIn")
    public String signIn(@RequestBody String info) {
        return "sign in successfully:" + info;
    }

    @PostMapping("/signUp")
    public String signUp(@RequestBody String info) {
//        model.addAttribute("name", name);
        return "sign up successfully";
    }

    @PostMapping("/signOut")
    public String signOut(@RequestBody String info) {
        return "sign out successfully";
    }

    @GetMapping("/handleError")
    public String handleError(Map<String, Object> model) {
        model.put("errorMsg", errorMsg);
        return "error";
    }

    @RequestMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        model.put("name", message);
//        model.addAttribute("name", name);
        return "greeting";
    }


}
