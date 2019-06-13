package com.biz.conrroller;

import com.biz.mode.StudentVO;

public class StdExec_01 {

	public static void main(String[] args) {

		StudentVO stdVO= new StudentVO();
		stdVO.setNumber("1");
		stdVO.setName("홍길동");
		stdVO.setGrade(3);
		stdVO.setAddr("서울시");
		stdVO.setTel("001");
		
		System.out.println(stdVO.toString());
		
		
		
	}

}
