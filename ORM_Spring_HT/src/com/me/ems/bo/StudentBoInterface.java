package com.me.ems.bo;

import com.me.ems.model.Student;

public interface StudentBoInterface {
	public int createStudent(Student st);
	public Student findStudent(int id);

}
