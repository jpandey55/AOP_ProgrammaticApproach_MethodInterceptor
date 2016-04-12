package com.me.ems.dao;

import com.me.ems.model.Student;

public interface StudentDaoInterface {
	public int save(Student st);
	public Student find(int id);
}
