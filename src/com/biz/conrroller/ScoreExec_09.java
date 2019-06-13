package com.biz.conrroller;

import com.biz.sevice.ScoreSevice_01;

public class ScoreExec_09 {

	public static void main(String[] args) {

		ScoreSevice_01 ss = new ScoreSevice_01();
		for (int i = 0; i < 3; i++) {
			try {
				if (ss.inPutScore(i))
					break;
			} catch (Exception e) {
				System.out.println("점수 입력 오류");
				System.out.println((i + 1) + "번째 다시입력");
				i--;
				continue;

			}
		}
		ss.makeTotal();
		ss.makeRank();
		ss.viewScore();
	}

}
