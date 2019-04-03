package com.zh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.mapper.NewsCommentMapper;
import com.zh.pojo.NewsComment;
import com.zh.service.NewsCommentService;

@Service
public class NewsCommentServiceImpl implements NewsCommentService{
	@Resource
	private NewsCommentMapper newsCommentMapper;
	@Override
	public List<NewsComment> selCommentByNewsID(Integer newsid) {
		// TODO Auto-generated method stub
		return newsCommentMapper.selAllComment(newsid);
	}
	@Override
	public Boolean insComment(NewsComment newsComment) {
		int i = newsCommentMapper.insComment(newsComment);
		return i==1?true:false;
	}

}
