package com.single.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author liuyongkang
 * @date Create in 2025/2/23 下午9:45
 */
@RestController
public class LoginController {

    @GetMapping("login")
    public String login(String username, String password, HttpSession session) {
        session.setAttribute("username", username);
        return "success";
    }
    @GetMapping("getUser")
    public String getUser(HttpSession session) {
        return (String) session.getAttribute("username");
    }

}
