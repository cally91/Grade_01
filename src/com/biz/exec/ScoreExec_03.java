package com.biz.exec;

import com.biz.mode.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] scArray =new ScoreVO[5];
		
		scArray[0]= new ScoreVO("1",100,80,90);
		
		scArray[1]= new ScoreVO("2",100,45,75);
		scArray[2]= new ScoreVO("3",45,67,57);
		scArray[3]= new ScoreVO("4",48,56,56);
		scArray[4]= new ScoreVO("5",84,87,76);
		
		for (int i = 0 ; i <scArray.length;i++) {
			int intTotel = scArray[i].getKor();
			intTotel += scArray[i].getEng();
			intTotel += scArray[i].getMath();
			
			scArray[i].setTotal(intTotel);
			scArray[i].setAverage(intTotel/3);
		}
		for (ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
		
		
		
	}

}
