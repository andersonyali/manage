package com.destinyyali.mapper;

import com.destinyyali.entity.Tmenu;
import com.destinyyali.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface TmenuMapper extends MyMapper<Tmenu> {

    List<Tmenu> selectMenusByRoleId(Integer roleid);

    List<Tmenu> selectByParentIdAndRoleId(HashMap<String,Object> paraMap);

}