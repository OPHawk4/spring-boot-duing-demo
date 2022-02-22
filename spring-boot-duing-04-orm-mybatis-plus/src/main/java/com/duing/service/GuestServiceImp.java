package com.duing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GuestServiceImp extends ServiceImpl<GuestMapper,Guest> implements GuestService{

    @Autowired
    private GuestMapper guestMapper;

//    @Override
//    public List<Guest> getGuests() {
//        return guestMapper.getGuests();
//    }

    @Override
    public void add(Guest guest) {
        guestMapper.add(guest);
    }

    @Override
    public Guest get(String name) {
        return guestMapper.get(name);
    }

    @Override
    public void update(Guest guest) {
        guestMapper.update(guest);
    }

    @Override
    public void delete(String name) {
        guestMapper.delete(name);
    }


}
