package com.mtianyan.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mtianyan on 2018/2/4 0004.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer>{

    // 通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
