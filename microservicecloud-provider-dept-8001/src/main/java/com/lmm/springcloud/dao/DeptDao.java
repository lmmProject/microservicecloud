package com.lmm.springcloud.dao;

import java.util.List;
import com.lmm.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptDao {

	boolean addDept(Dept dept);

	Dept findById(Long id);

	List<Dept> findAll();
}
