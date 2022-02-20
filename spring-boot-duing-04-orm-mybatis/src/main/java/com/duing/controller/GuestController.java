package com.duing.controller;


import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller   /** 代表这个类是控制层**/
@RequestMapping("/guest") /**这里加RequestMapping 是为了默认所有连接头部都是“/guest” **/
public class GuestController {

    /**
     * 自动注入
     * 因为它GuestService是个接口，所以自动注入is-a类（实现 GuestServiceImp）
     * **/
    @Autowired
    private GuestService guestService;

    /**
     * restful风格，中文释义：宁静的；安静的；给人休息的
     * 默认参数
     * @GeMapping 相当于@RequestMapping(value = “”, method = RequestMethod.GET)
     *
     * 当浏览器访问localhost:8090/guest默认跳转主页面
     * model可以把从数据库传递过来的数据带走
    * */
    @GetMapping
    public String list(Model model){
        List<Guest> guestList = guestService.getGuests();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    /**
     * 当点击添加按钮直接转发到  添加界面
     * **/
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    /**
     * restful风格，中文释义：宁静的；安静的；给人休息的
     * @PostMapping 等价 @RequestMapping(value = “”, method = RequestMethod.POST)
     * **/
    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }


    //修改Guest
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }

}
