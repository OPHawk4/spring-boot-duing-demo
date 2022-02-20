package com.duing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duing.bean.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface GuestMapper extends BaseMapper<Guest> {
//    @Select("select * from guest")
//    List<Guest> getGuests();
//
    @Insert("insert into guest (id,name,role) value(1,${name},${role})")
    void add(Guest guest);
//
//    @Update("update guest name=${name} where name=name")
//    void update(String name);
}
