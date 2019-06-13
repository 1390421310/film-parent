package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zh.pojo.Category;

public interface CategoryMapper {
	@Select("select * from category")
	List<Category> selAllCategory();
	@Insert("insert into category values(default,#{0})")
	int insCategory(String name);
	@Delete("delete from category where id=#{0}")
	int delCategory(Integer id);
	@Update("update category set name=#{param2} where id=#{param1}")
	int updCategory(Integer id,String name);
	@Select("select name from category where id=#{0}")
	String selNameById(Integer id);
}
