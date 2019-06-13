package com.zh.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CommentDubboService;
import com.zh.pojo.Comment;
import com.zh.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	@Reference
	private CommentDubboService commentDubboService;
	@Override
	public List<Comment> selAllComment() {
		// TODO Auto-generated method stub
		return commentDubboService.selAllComment();
	}
	@Override
	public int insComment(String fname, String uname, String content, Date date) {
		// TODO Auto-generated method stub
		return commentDubboService.insComment(fname, uname, content, date);
	}
	@Override
	public int delComment(Integer id) {
		// TODO Auto-generated method stub
		return commentDubboService.delComment(id);
	}

}
