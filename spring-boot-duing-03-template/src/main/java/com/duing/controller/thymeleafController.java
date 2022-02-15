package com.duing.controller;

import com.duing.bean.Computer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleafController {

    @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("name","thymeleaf");
        return "welcome";
    }

    @RequestMapping("/computer")
    public String showComputer(Model model){
        Computer computer = new Computer();
        computer.setLog("Asus");
        computer.setPrice(3999.0f);
        model.addAttribute("computer",computer);
        return "thymeleaf";
    }
}
