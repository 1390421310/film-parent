package com.zh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.mapper.NewsCommentMapper;
import com.zh.mapper.NewsDetailMapper;
import com.zh.pojo.NewsDetail;
import com.zh.service.NewsDetailService;

@Service
public class NewsDetailServiceImpl implements NewsDetailService{
	@Resource
	private NewsDetailMapper newsDetailMapper;
	@Resource
	private NewsCommentMapper newsCommentMapper;
	@Override
	public List<NewsDetail> selAll() {
		// TODO Auto-generated method stub
		return newsDetailMapper.selAll();
	}
	@Override
	public List<NewsDetail> selByTitle(String title) {
		// TODO Auto-generated method stub
		return newsDetailMapper.selByTitle(title);
	}
	@Override
	public boolean delNewsAndComment(Integer id) {
		newsCommentMapper.delByNewsid(id);
		int i = newsDetailMapper.delById(id);
		return i==1?true:false;
	}
	
	
}
