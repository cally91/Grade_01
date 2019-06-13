package com.biz.sevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.mode.StudentVO;

public class StudentService {

	List<StudentVO> stdList;
	Scanner scan;

	public StudentService() {

		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	public boolean inPutStudent(int Number) throws NumberFormatException{
		Number++;
		int intLan = stdList.size();
		System.out.print(Number+"번 학생 번호>>");
		String strnum =scan.nextLine();
		
			System.out.print( Number+"번 학생 이름>>");
			String strname = scan.nextLine();

			System.out.print(Number+"번 학생 학년>>");
			String streng = scan.nextLine();
			int inteng =Integer.valueOf(streng);
			System.out.print( Number+"번 학생 사는곳>>");
			String straddr = scan.nextLine();

			System.out.print( Number+"번  학생 전번>>");
			String strtel = scan.nextLine();

			StudentVO vo = new StudentVO();
		vo.setNumber(strnum);
			vo.setName(strname);
			vo.setGrade(inteng);
			vo.setAddr(straddr);
			vo.setTel(strtel);
			stdList.add(vo);
			
		return true;
	}

	public void viewStudents() {
		System.out.println("=================================");
		System.out.println("번호\t이름\t학년\t사는곳\t전번");
		System.out.println("================================");
		for (StudentVO vo : stdList) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\n",vo.getNumber(),vo.getName(),vo.getGrade(),vo.getAddr(),vo.getTel());
		}
		System.out.println("===================");
 
	
	}
	
}
