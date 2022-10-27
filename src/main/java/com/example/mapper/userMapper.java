package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper  extends BaseMapper<user> {
}
