package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zh.pojo.NewsDetail;

public interface NewsDetailMapper {
	@Select("Select * from news_detail")
	List<NewsDetail> selAll();
	@Select("select * from news_detail where title like concat('%',#{title},'%')")
	List<NewsDetail> selByTitle(String title);
	@Delete("delete from news_detail where id=#{0}")
	int delById(Integer id);
}
