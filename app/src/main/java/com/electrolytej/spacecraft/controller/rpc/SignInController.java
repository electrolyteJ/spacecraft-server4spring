//package com.hawksjamesf.spacecraft.controller.rpc;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
///**
// * Copyright ® $ 2017
// * All right reserved.
// *
// * @author: hawks.jamesf
// * @since: Dec/20/2018  Thu
// *
// *
// * https://blog.jscrambler.com/rpc-style-vs-rest-web-apis/
// */
//@Controller
////@ResponseBody
//public class SignInController {
//    @Value("${errorMsg:unknown}")
//    private String errorMsg;
//
//    @ApiOperation(value = "登入账号", notes = "登入账号")
////    @ResponseStatus(HttpStatus.UPDATE)
//    @PutMapping("/signIn")
//    public String signIn(@RequestBody String info) {
//        return "sign in successfully:" + info;
//    }
//
//    @ApiOperation(value = "注册账号", notes = "注册账号")
////    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/signUp")
//    public String signUp(@RequestBody String info) {
////        model.addAttribute("name", name);
//        return "sign up successfully";
//    }
//
//    @ApiOperation(value = "退出账号", notes = "退出账号")
////    @ResponseStatus(HttpStatus.UPDATE)
////    @PutMapping("/signOut")
//    public String signOut(@RequestBody String info) {
//        return "sign out successfully";
//    }
//
////    @ApiOperation(value = "删除账号", notes = "删除账号")
////    @ResponseStatus(HttpStatus.DELETE)
////    @DeleteMapping("/signOut")
////    public String signOut(@RequestBody String info) {
////        return "sign out successfully";
////    }
//
//    @ApiOperation(value = "错误提示", notes = "错误提示")
//    @GetMapping("/handleError")
//    public String handleError(Map<String, Object> model) {
//        model.put("errorMsg", errorMsg);
//        return "error";
//    }
//
//
//}
