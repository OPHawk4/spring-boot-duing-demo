package com.duing.controller;


import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Model model , Guest guest){
        guestService.add(guest);
        model.addAttribute("guest",guest);
        return "redirect:/guest";
    }
//
//    @GetMapping("/toUpdate")
//    public String toUpdate(Model model,String name){
//        Guest guest = guestService
//        model.addAttribute("guest",guest);
//        return "update";
//    }
}
