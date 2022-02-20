package com.duing.mapper;

import com.duing.bean.Guest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GuestMapper {
    @Select("select * from guest")
    List<Guest> getGuests();

    @Insert("insert into guest (name,role) value(#{name},#{role})")
    void add(Guest guest);

    @Select("select * from guest where name=#{name}")
    Guest get(String name);

    @Update("Update guest set name=#{name},role=#{role} where name=#{name}")
    void update(Guest guest);

    @Delete("delete from guest where name=#{name}")
    void delete(String name);
}
