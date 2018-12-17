package com.destinyyali.service.impl;

import com.destinyyali.entity.Trole;
import com.destinyyali.entity.Trolemenu;
import com.destinyyali.mapper.TroleMapper;
import com.destinyyali.service.TroleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href=""mailto:zhaojt@gtmap.cn></a>
 * @version 1.0, 2017/11/10
 * @description
 */

@Service("troleService")
public class TroleServiceImpl   extends BaseService<Trole> implements TroleService {
    @Autowired
    private TroleMapper troleMapper;

    @Override
    public List<Trole> selectRolesByUserId(Integer userid) {
        return troleMapper.selectRolesByUserId(userid);
    }
}
