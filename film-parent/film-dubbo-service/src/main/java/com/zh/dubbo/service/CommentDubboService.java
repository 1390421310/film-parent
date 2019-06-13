package com.zh.dubbo.service;

import java.sql.Date;
import java.util.List;

import com.zh.pojo.Comment;

public interface CommentDubboService {
	/**
	 * 查询全部评论
	 * @return
	 */
	List<Comment> selAllComment();
	/**
	 * 用户添加评论
	 * @param fname
	 * @param uname
	 * @param content
	 * @param date
	 * @return
	 */
	int insComment(String fname,String uname,String content,Date date); 
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	int delComment(Integer id);
}
