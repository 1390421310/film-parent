package com.zh.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.Photo;

public interface PhotoMapper {
	@Select("select * from photo where id=#{0}")
	Photo selPhotoById(Long id);
	@Insert("insert into photo values(#{0},#{1})")
	int insPhoto(long id,String name);
}
