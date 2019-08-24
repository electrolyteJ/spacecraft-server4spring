package com.hawksjamesf.spacecraft.controller.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import static java.awt.SystemColor.info;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Dec/20/2018  Thu
 * <p>
 * reference:http://www.ruanyifeng.com/blog/2014/05/restful_api.html
 * <p>
 * https://blog.jscrambler.com/rpc-style-vs-rest-web-apis/
 * <p>
 * method:
 * GET（SELECT）：从服务器取出资源（一项或多项）。
 * POST（CREATE）：在服务器新建一个资源。
 * PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
 * PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
 * DELETE（DELETE）：从服务器删除资源。
 * <p>
 * <p>
 * status code:[https://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html]
 * 200 OK - [GET]：服务器成功返回用户请求的数据，该操作是幂等的（Idempotent）。
 * 201 CREATED - [POST/PUT/PATCH]：用户新建或修改数据成功。
 * 202 Accepted - [*]：表示一个请求已经进入后台排队（异步任务）
 * 204 NO CONTENT - [DELETE]：用户删除数据成功。
 * 400 INVALID REQUEST - [POST/PUT/PATCH]：用户发出的请求有错误，服务器没有进行新建或修改数据的操作，该操作是幂等的。
 * 401 Unauthorized - [*]：表示用户没有权限（令牌、用户名、密码错误）。
 * 403 Forbidden - [*] 表示用户得到授权（与401错误相对），但是访问是被禁止的。
 * 404 NOT FOUND - [*]：用户发出的请求针对的是不存在的记录，服务器没有进行操作，该操作是幂等的。
 * 406 Not Acceptable - [GET]：用户请求的格式不可得（比如用户请求JSON格式，但是只有XML格式）。
 * 410 Gone -[GET]：用户请求的资源被永久删除，且不会再得到的。
 * 422 Unprocesable entity - [POST/PUT/PATCH] 当创建一个对象时，发生一个验证错误。
 * 500 INTERNAL SERVER ERROR - [*]：服务器发生错误，用户将无法判断发出的请求是否成功。
 * <p>
 * <p>
 * sample code:
 * GET /zoos：列出所有动物园
 * POST /zoos：新建一个动物园
 * GET /zoos/ID：获取某个指定动物园的信息
 * PUT /zoos/ID：更新某个指定动物园的信息（提供该动物园的全部信息）
 * PATCH /zoos/ID：更新某个指定动物园的信息（提供该动物园的部分信息）
 * DELETE /zoos/ID：删除某个动物园
 * GET /zoos/ID/animals：列出某个指定动物园的所有动物
 * DELETE /zoos/ID/animals/ID：删除某个指定动物园的指定动物
 */
//@Controller
//@ResponseBody
@RestController
//@RequestMapping("/api/users")
public class SignInController {
    @Value("${errorMsg:unknown}")
    private String errorMsg;
    @Autowired
    DataSource dataSource;

    @ApiOperation(value = "登入用户", notes = "登入用户")
//    @ResponseStatus(HttpStatus.UPDATE)
    @PutMapping("/profile")
    public String signIn(@RequestBody Map<String, Object> model) {
        String name = (String) model.get("name");
        String pwd = (String) model.get("password");
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connetct:"+connection);
        return "sign in successfully:" + info;
    }

    @ApiOperation(value = "注册用户", notes = "注册用户")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/profile")
    public String signUp(@RequestBody String info) {
//        model.addAttribute("name", name);
        return "sign up successfully";
    }

//    @ApiOperation(value = "退出用户", notes = "退出用户")
//    @ResponseStatus(HttpStatus.UPDATE)
//    @PutMapping("/profile")
//    public String signOut(@RequestBody String info) {
//        return "sign out successfully";
//    }

//    @ApiOperation(value = "删除用户", notes = "删除用户")
////    @ResponseStatus(HttpStatus.DELETE)
//    @DeleteMapping("/profile")
//    public String signOut(@RequestBody String info) {
//        return "sign out successfully";
//    }

    @ApiOperation(value = "错误提示", notes = "错误提示")
    @GetMapping("/error")
    public String handleError(Map<String, Object> model) {
        model.put("errorMsg", errorMsg);
        return "error";
    }


}
