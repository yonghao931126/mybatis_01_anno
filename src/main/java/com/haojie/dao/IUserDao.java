package com.haojie.dao;

import com.haojie.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from user ")
    List<User> findAll();
}
