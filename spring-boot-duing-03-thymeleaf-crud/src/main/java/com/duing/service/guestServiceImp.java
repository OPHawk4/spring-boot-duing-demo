package com.duing.service;

import com.duing.bean.Guest;
import com.duing.mapper.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class guestServiceImp implements guestService{

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public Guest get(String name) {
        Guest guest = guestDao.get(name);
        return guest;
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }
}
