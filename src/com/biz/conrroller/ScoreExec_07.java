package com.biz.conrroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.mode.ScoreVO;

public class ScoreExec_07 {

	public static void main(String[] args) {

		List<ScoreVO> scList =new ArrayList<ScoreVO>();
		Scanner scan =new  Scanner(System.in);
		
		for (int i =0; i<5 ;i++){
			System.out.print((i+1)+"번 국어 수학 영어>>");
			String setkor = scan.nextLine();
			int intkor = Integer.valueOf(setkor);
			
			System.out.print((i+1)+"번 국어 수학 영어>>");
			String seteng = scan.nextLine();
			int inteng = Integer.valueOf(seteng);
			
			System.out.print((i+1)+"번 국어 수학 영어>>");
			String setmath =scan.nextLine();
			int intmath = Integer.valueOf(setmath);
			
			int inttotal=  intkor+inteng+intmath;
			int average= inttotal/3;
			
			scList.add(new ScoreVO(""+(i+1),intkor,inteng,intmath,inttotal,average));
			
				
			}
		for (ScoreVO vo: scList) {
			System.out.println(vo.toString());
			
					
		}
		int scLen=scList.size();
		for (int i=0; i <scLen ;i++) {
			ScoreVO vo= scList.get(i);
					int  totol =vo.getKor();
			totol +=vo.getEng();
			totol +=vo.getMath();
		} 
		
		for (ScoreVO vo: scList) {
			System.out.println(vo.toString());
			
					
		}
		
		
		
	}

}
