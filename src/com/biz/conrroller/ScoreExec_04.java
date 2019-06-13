package com.biz.conrroller;

import java.util.ArrayList;
import java.util.List;

import com.biz.mode.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		scList.add(new ScoreVO("1", 90, 80, 70));
		scList.add(new ScoreVO("2", 87, 75, 95));
		scList.add(new ScoreVO("3", 86, 67, 85));
		scList.add(new ScoreVO("4", 58, 75, 83));
		scList.add(new ScoreVO("5", 79, 83, 93));
		scList.add(new ScoreVO("6", 78, 83, 73));

		int scLan = scList.size();
		for (int i = 0; i < scLan; i++) {
			ScoreVO vo = scList.get(i);
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}
		for (ScoreVO vo: scList) {
			System.out.println(vo.toString());
		}
	}

}
