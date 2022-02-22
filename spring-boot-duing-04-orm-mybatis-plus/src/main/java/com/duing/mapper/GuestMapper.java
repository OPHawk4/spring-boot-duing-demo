package com.duing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duing.bean.Guest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper/**
    有了这个@Mapper可以不用配置mybatis_config.xml和mapper的命名空间
 **/
public interface GuestMapper extends BaseMapper<Guest> {
    @Select("select * from guest")
    List<Guest> getGuests();
//
    @Insert("insert into guest (name,role) value(#{name},#{role})")
    void add(Guest guest);

    @Update("update guest set role=#{role} where name=#{name}")
    void update(Guest guest);

    @Select("select * from guest where name=#{name}")
    Guest get(String name);

    @Delete("delete from guest where name=#{name}")
    void delete(String name);
}
