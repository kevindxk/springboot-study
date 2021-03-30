package com.kevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

/**
 * @project_name：springbootproject
 * @name：IndexController
 * @date：2021/3/28 10:04 下午
 * @auther：dexukong
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","hello springboot");
        model.addAttribute("users", Arrays.asList("kevin","kdx"));
        return "index";
    }

}
