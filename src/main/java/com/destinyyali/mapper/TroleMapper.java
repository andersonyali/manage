package com.destinyyali.mapper;

import com.destinyyali.entity.Trole;
import com.destinyyali.util.MyMapper;

import java.util.List;

public interface TroleMapper extends MyMapper<Trole> {

    List<Trole> selectRolesByUserId(Integer userid);

}