package com.biz.conrroller;

import com.biz.sevice.ScoreSevice;
import com.biz.sevice.ScoreSevice_03;

public class ScoreExec_10 {

	public static void main(String[] args) {

		ScoreSevice ss=new ScoreSevice_03();
		for (int i =0 ; i<100 ; i++) {
			if (ss.inPutScore(i));
		}
		ss.makeTotal();
		ss.makeRank();
		ss.viewScore();
	}

}
