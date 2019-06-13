package com.zh.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.PhotoDubboService;
import com.zh.mapper.PhotoMapper;
import com.zh.pojo.Photo;

public class PhotoDubboServiceImpl implements PhotoDubboService{
	@Autowired
	private PhotoMapper photoMapper;
	@Override
	public Photo selPhotoById(Long id) {
		// TODO Auto-generated method stub
		return photoMapper.selPhotoById(id);
	}
	@Override
	public int insPhoto(long id, String name) {
		// TODO Auto-generated method stub
		return photoMapper.insPhoto(id, name);
	}

}
