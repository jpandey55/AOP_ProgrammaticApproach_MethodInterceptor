package com.me.ems.bo;

import com.me.ems.dao.StudentDaoInterface;
import com.me.ems.model.Student;

public class StudentBoImplemenatation implements StudentBoInterface {
	private StudentDaoInterface sdao;

	public StudentDaoInterface getSdao() {
		return sdao;
	}

	public void setSdao(StudentDaoInterface sdao) {
		this.sdao = sdao;
	}

	@Override
	public int createStudent(Student st) {
		// TODO Auto-generated method stub
		return sdao.save(st);
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return sdao.find(id);
	}
	
}
