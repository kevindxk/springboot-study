package com.kevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @project_name：springbootproject
 * @name：LoginController
 * @date：2021/3/31 9:44 下午
 * @auther：dexukong
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){

        if (username.equals("")&& "123456".equals(password)){
            session.setAttribute("loginUser","username");
            return "登陆成功";
        }else{
//            model.addAttribute("meg","用户名或密码不正确");
            return "登陆失败";
        }

    }
}
