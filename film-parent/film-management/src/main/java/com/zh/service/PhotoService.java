package com.zh.service;

import com.zh.pojo.Photo;

public interface PhotoService {
	int insPhoto(long id,String name);
	
	Photo selPhotoById(Long id);
}
