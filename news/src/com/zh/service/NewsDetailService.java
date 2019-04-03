package com.zh.service;

import java.util.List;

import com.zh.pojo.NewsDetail;

public interface NewsDetailService {
	List<NewsDetail> selAll();
	
	List<NewsDetail> selByTitle(String title);
	
	boolean delNewsAndComment(Integer id);
}
