package com.biz.conrroller;

import com.biz.mode.ScoreVO;

public class ScoreExec_01 {

	public static void main(String[] args) {

		ScoreVO scVO =new ScoreVO();
		
		scVO.setNumber("1");
		scVO.setKor(90);
		scVO.setEng(100);
		scVO.setMath(70);
		

		int intTotal =scVO.getKor();
		intTotal +=scVO.getEng();
		intTotal +=scVO.getMath();
		scVO.setTotal(intTotal);
		scVO.setAverage(intTotal/3);
		
	}

}
