package com.zh.dubbo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.CommentDubboService;
import com.zh.mapper.CommentMapper;
import com.zh.pojo.Comment;

public class CommentDubboServiceImpl implements CommentDubboService{
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public List<Comment> selAllComment() {
		// TODO Auto-generated method stub
		return commentMapper.selAllComment();
	}
	@Override
	public int insComment(String fname, String uname, String content, Date date) {
		// TODO Auto-generated method stub
		return commentMapper.insComment(fname, uname, content, date);
	}
	@Override
	public int delComment(Integer id) {
		// TODO Auto-generated method stub
		return commentMapper.delComment(id);
	}

}
