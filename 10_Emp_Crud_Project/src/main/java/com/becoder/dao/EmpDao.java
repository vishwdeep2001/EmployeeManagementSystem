package com.becoder.dao;

import java.util.List;

import com.becoder.entity.Emp;

public interface EmpDao {
	public int saveEmp(Emp emp);
	public Emp getEmpbyId(int Id);
	public List<Emp> getAllEmp();
	public void update(Emp emp);
	public void deleteEmp(int id);
	
	
	
}
