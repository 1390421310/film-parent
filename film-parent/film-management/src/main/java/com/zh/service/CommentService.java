package com.zh.service;

import java.sql.Date;
import java.util.List;

import com.zh.pojo.Comment;

public interface CommentService {
	
	List<Comment> selAllComment();
	
	int insComment(String fname,String uname,String content,Date date);
	
	int delComment(Integer id);
}
