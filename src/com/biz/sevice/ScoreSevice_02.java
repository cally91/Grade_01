package com.biz.sevice;

import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.mode.ScoreVO;

public class ScoreSevice_02 implements ScoreSevice{

	private List<ScoreVO> ScoreList;
	private Scanner scnn;

	public ScoreSevice_02() {
		ScoreList = new ArrayList<ScoreVO>();
		scnn = new Scanner(System.in);
	}

	/*
	 * throws 혹시 메서드가 실행되는 과정에서 exception 이 발생할 확률이 단 1%라도 준재하면 발생된 exception을
	 * throws 하여 호출되 곳에서 발생된 exception을 처리하도록 하는 키워드
	 */
	public boolean inPutScore(int number) throws NumberFormatException {
		number++;
		Random rnd = new Random();
		int intkor = rnd.nextInt(50) + 51;
		int intmath = rnd.nextInt(50) + 51;
		int inteng = rnd.nextInt(50) + 51;

		ScoreList.add(new ScoreVO("" + number, intkor, inteng, intmath));
		return false;
	}

	public void makeTotal() {
		int listLen = ScoreList.size();
		for (int i = 0; i < listLen; i++) {
			ScoreVO vo = ScoreList.get(i);
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}

	}

	public void makeRank() {

		List<String> s = new ArrayList<String>();
		Collections.sort(s);
		Collections.sort(ScoreList, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO si, ScoreVO sj) {
				if (si.getTotal() > sj.getTotal())return -1;
					
				else if (si.getTotal() < sj.getTotal())return 1;
					
				else return 0;
					
			}
		});

		int listLan = ScoreList.size();
		for (int i = 0; i < listLan; i++) {
			ScoreList.get(i).setRank(i + 1);
		}

	}

	public void viewScore() {
		System.out.println("======================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-----------------------------------");
		for (ScoreVO vo : ScoreList) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\n");
			System.out.print(vo.getRank() + "\n");
		}
		System.out.println("=====================================");
	}
}
