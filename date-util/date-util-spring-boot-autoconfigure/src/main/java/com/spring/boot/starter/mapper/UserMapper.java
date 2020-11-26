package com.spring.boot.starter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.boot.starter.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
