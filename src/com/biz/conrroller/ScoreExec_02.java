package com.biz.conrroller;

import com.biz.mode.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO("1", 80, 70, 60, 0, 0, 0);

		int intTotal = sVO.getKor();
		intTotal += sVO.getEng();
		intTotal += sVO.getMath();
		sVO.setTotal(intTotal);
		
		sVO=new ScoreVO("1",56,65,56);
	}

}
