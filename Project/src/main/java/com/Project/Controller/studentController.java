package com.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Project.Entity.student;
import com.Project.Services.StudentService;

@Controller
public class studentController {
	@Autowired
	private StudentService Service;
	
	@RequestMapping("/SaveStudent")
	public String saveStudentpage(){
		return "SaveStudent";
	}
	
	@RequestMapping("/SaveStudentData")
	public String SaveStudentData(@ModelAttribute ("Student") student Student) {
		Service.savestudent(Student);
		return "SaveStudent";
	}

}
