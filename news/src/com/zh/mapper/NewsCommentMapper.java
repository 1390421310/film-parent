package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.NewsComment;

public interface NewsCommentMapper {
	
	@Select("select id,content,author,createdate from news_comment where newsid=#{0}")
	List<NewsComment> selAllComment(Integer newsid);
	@Insert("insert into news_comment values(default,#{newsid},#{content},#{author},#{createDate})")
	int insComment(NewsComment newsComment);
	@Delete("delete from news_comment where newsid=#{0}")
	int delByNewsid(Integer newsid);
}
