package com.duing.service;

import com.duing.bean.Guest;

import java.util.List;

public interface guestService {
    List<Guest> list();
    void add(Guest guest);
    void update(Guest guest);
    Guest get(String name);
    void delete(String name);
}
