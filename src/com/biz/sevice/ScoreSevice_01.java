package com.biz.sevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.mode.ScoreVO;

public class ScoreSevice_01 implements ScoreSevice{

	private List<ScoreVO> ScoreList ;
	private Scanner scnn;
	public ScoreSevice_01() {
		ScoreList =new ArrayList<ScoreVO>();
		scnn =new Scanner(System.in);
	}
	/*
	 * throws
	 * 혹시 메서드가 실행되는 과정에서
	 * exception 이 발생할 확률이 단 1%라도 준재하면
	 * 발생된 exception을 throws 하여
	 * 호출되 곳에서 발생된 exception을 처리하도록 하는 키워드
	 */
	public  boolean inPutScore(int number)  throws NumberFormatException{
		number++;
		
		System.out.print(number+"번 국어점수(종료:EX) >>");
		String strkor =scnn.nextLine();
		if(strkor.equals("EX")) return false;
		
		int intkor =Integer.valueOf(strkor);
		
		System.out.print(number+"번 영어점수 >>");
		String streng =scnn.nextLine();
		int inteng =Integer.valueOf(streng);
		
		System.out.print(number+"번 수학점수 >>");
		String strmath =scnn.nextLine();
		int intmath =Integer.valueOf(strmath);
		
		ScoreVO vo =new ScoreVO(""+number,intkor,inteng,intmath);
		System.out.println(vo.toString());
		ScoreList.add(vo);
		return false;
	}
	public void makeTotal() {
		int listLen = ScoreList.size();
		for (int i = 0; i < listLen ; i++) {
			ScoreVO vo = ScoreList.get(i);
			int intTotal = vo.getKor();
			 intTotal += vo.getEng();
			 intTotal += vo.getMath();
			 vo.setTotal(intTotal);
			 vo.setAverage(intTotal/3);
		}
		
	}
	public void makeRank() {
		
		int listLan =ScoreList.size();
		for (int i = 0; i <listLan ; i++) {
			for (int j =i +1 ; j <listLan ; j++) {
				ScoreVO si = ScoreList.get(i);
				ScoreVO sj = ScoreList.get(j);
				if (si.getTotal() <sj.getTotal()) {
					ScoreVO _score =si;
					ScoreList.set(i, sj);
					ScoreList.set(j,_score);
				}
			}
		}
		for (int i =0 ; i< listLan ; i++) {
			ScoreList.get(i).setRank(i+1);
		}
		
	}
	public void viewScore() {
		System.out.println("======================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------");
		for (ScoreVO vo : ScoreList) {
			System.out.print(vo.getNumber()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getTotal()+"\t");
			System.out.print(vo.getAverage()+"\n");
		}
		System.out.println("=====================================");
	}
}
