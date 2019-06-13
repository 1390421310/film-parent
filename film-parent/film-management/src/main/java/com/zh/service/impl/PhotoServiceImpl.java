package com.zh.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.PhotoDubboService;
import com.zh.pojo.Photo;
import com.zh.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService{
	@Reference
	private PhotoDubboService photoDubboService;
	@Override
	public int insPhoto(long id, String name) {
		// TODO Auto-generated method stub
		return photoDubboService.insPhoto(id, name);
	}
	@Override
	public Photo selPhotoById(Long id) {
		// TODO Auto-generated method stub
		return photoDubboService.selPhotoById(id);
	}

}
