package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.City;

public interface CityMapper {
	@Select("select * from city")
	List<City> selAllCity();
	@Select("select * from city where id=#{0}")
	City selById(Integer id);
	@Delete("delete from city where id=#{0}")
	Integer delCityById(Integer id);
	@Insert("insert into city values(default,#{0})")
	int insCity(String name);
}
