package com.zh.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.Comment;

public interface CommentMapper {
	@Select("select * from comments")
	List<Comment> selAllComment();
	@Delete("delete from comments where id=#{0}")
	int delComment(Integer id);
	@Insert("insert into comments values (default,#{2},#{1},#{3},#{0})")
	int insComment(String fname,String uname,String content,Date date);
}
