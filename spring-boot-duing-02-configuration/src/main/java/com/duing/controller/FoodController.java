package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetable;
import com.duing.bean.fish;
import com.duing.config.FoodConfig;
import com.duing.config.VegetableConfig;
import com.duing.config.fishConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
//    @Value("${food.rice}")
//    private String rice;
//
//    @Value("${food.meat}")
//    private String meat;
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/showFood")
    public Food show(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Autowired
    private VegetableConfig vegetableConfig;

    @RequestMapping("/vegetables")
    public Vegetable vegetables(){
        Vegetable vegetable = new Vegetable();
        vegetable.setPotato(vegetableConfig.getPotato());
        vegetable.setEggPlant(vegetableConfig.getEggPlant());
        vegetable.setGreenPepper(vegetableConfig.getGreenPepper());
        return vegetable;
    }

    @Autowired
    private fishConfig fc;
    @RequestMapping("/fish")
    public fish showfish(){
        fish f = new fish();
        f.setDoufu(fc.getDoufu());
        f.setDacong(fc.getDacong());
        return f;
    }
    @Value("${info.user}")
    private String user;
    @Value("${info.password}")
    private String password;
    @RequestMapping("/jasypt")
    public String info(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(user);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }
}
