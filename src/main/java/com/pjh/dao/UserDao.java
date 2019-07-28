package com.pjh.dao;

import com.pjh.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserDao {
    public ArrayList<Emp> getuser();
}
