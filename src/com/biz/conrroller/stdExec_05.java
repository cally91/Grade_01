package com.biz.conrroller;

import com.biz.sevice.StudentService;

public class stdExec_05 {

	public static void main(String[] args) {

		StudentService ss=new StudentService();
		for (int i = 0 ; i <1; i++){
			ss.inPutStudent(i);
		}
		ss.viewStudents();
	}

}
