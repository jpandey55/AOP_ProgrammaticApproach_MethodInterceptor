package com.me.ems.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.me.ems.dao.StudentDaoImpl;
import com.me.ems.model.Student;

@WebServlet("/empsave")
public class EmpSaveController extends HttpServlet {
	ConfigurableApplicationContext cap;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		cap = new ClassPathXmlApplicationContext("resources/spring.xml");
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		int pk =  Integer.parseInt(req.getParameter("pk"));
	
		StudentDaoImpl s = (StudentDaoImpl) cap.getBean("dao");
	/*
	 	//send data to business
		Student st = new Student();
		st.setAddress(address);
		st.setEmail(email);
		st.setId(id);
		st.setName(name);
		
		
		
		int i = s.save(st);
		if(i!=0)
			System.out.println("Success");
		else
			System.out.println("failed");
	*/
		//Search Database
		Student s1 = s.find(pk);
		s1.print();
	}

}
