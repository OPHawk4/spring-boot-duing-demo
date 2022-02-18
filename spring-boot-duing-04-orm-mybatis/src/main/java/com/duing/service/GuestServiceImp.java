package com.duing.service;

import com.duing.bean.Guest;
import com.duing.mapper.GuestMapper;

import com.duing.tk.mapper.TKGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService{

    @Autowired
    private TKGuestMapper tkGuestMapper;

    @Override
    public List<Guest> getGuests() {
        return tkGuestMapper.selectAll() ;
    }

}
