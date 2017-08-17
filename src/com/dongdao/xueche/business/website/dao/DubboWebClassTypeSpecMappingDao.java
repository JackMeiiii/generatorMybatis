package com.dongdao.xueche.business.website.dao;

import com.dongdao.xueche.business.model.WebClassTypeSpecMapping;

public interface DubboWebClassTypeSpecMappingDao {
    int deleteByPrimaryKey(Integer id);

    int save(WebClassTypeSpecMapping record);

    int saveSelective(WebClassTypeSpecMapping record);

    WebClassTypeSpecMapping findByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebClassTypeSpecMapping record);

    int updateByPrimaryKey(WebClassTypeSpecMapping record);
}