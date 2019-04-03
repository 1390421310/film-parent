package com.zh.service;

import java.util.List;

import com.zh.pojo.NewsComment;

public interface NewsCommentService {
	List<NewsComment> selCommentByNewsID(Integer newsid);
	
	Boolean insComment(NewsComment newsComment);
}
