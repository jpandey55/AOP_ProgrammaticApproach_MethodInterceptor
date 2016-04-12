package com.me.ems.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.me.ems.model.Student;

public class StudentDaoImpl implements StudentDaoInterface {
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Student st) {
		// TODO Auto-generated method stub
		int i = (int) ht.save(st);
		return i;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return (Student)ht.get(Student.class, id);
	}
	
	
	
}
