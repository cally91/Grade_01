package com.biz.conrroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.mode.ScoreVO;

public class ScoreExec_05 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			int intkor = rnd.nextInt(50) + 51;
			int inteng = rnd.nextInt(50) + 51;
			int intmath = rnd.nextInt(50) + 51;
			int Total = intkor + inteng + intmath;
			int intavg = Total / 3;
			scList.add(new ScoreVO("" + (i + 1), intkor, inteng, intmath, Total, intavg));
		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		System.out.println("===================");
		int scLan = scList.size();
		for (int i = 0; i < scLan; i++) {
			for (int j = i + 1; j < scLan; j++) {
				ScoreVO si = scList.get(i);
				ScoreVO sj = scList.get(j);
				if (si.getTotal() < sj.getTotal()) {
					ScoreVO _score = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, scList.get(i));
				}

			}
		}
		for (int i = 0; i < scLan; i++) {
			scList.get(i).setRank(i + 1);
		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
	}

}
