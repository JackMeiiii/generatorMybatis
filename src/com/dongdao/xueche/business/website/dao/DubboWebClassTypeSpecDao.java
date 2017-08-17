package com.dongdao.xueche.business.website.dao;

import com.dongdao.xueche.business.model.WebClassTypeSpec;

public interface DubboWebClassTypeSpecDao {
    int deleteByPrimaryKey(Integer id);

    int save(WebClassTypeSpec record);

    int saveSelective(WebClassTypeSpec record);

    WebClassTypeSpec findByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebClassTypeSpec record);

    int updateByPrimaryKey(WebClassTypeSpec record);
}