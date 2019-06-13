package com.zh.dubbo.service;

import com.zh.pojo.Photo;

public interface PhotoDubboService {
	Photo selPhotoById(Long id);
	
	int insPhoto(long id,String name);
}
