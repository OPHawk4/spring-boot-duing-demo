package com.duying.service;

import com.duying.bean.Guest;
import com.duying.respository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService{

    @Autowired
    private GuestRepository guestRepository;
    @Override
    public List<Guest> list() {
        return guestRepository.findAll();
    }

}
