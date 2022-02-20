package com.duing.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.duing.bean.Guest;

import java.util.List;

public interface GuestService extends IService<Guest> {
    void add(Guest guest);
//    void update(String name);
//    void delete(String name);
}
