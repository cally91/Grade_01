package com.biz.conrroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.mode.ScoreVO;

public class ScoreExec_08 {

	public static void main(String[] args) {

		/*
		 * 학생의 성적을 입력받는 동안에 실수로 점수를 잘못입력받으면 (숫자에 문자가 포함되는 경우) Exception이 발생하는데 Exp 발생하면
		 * 다시 학생의 점수를 입력받도록 처리
		 * 
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			/*
			 * 3과목의 점수를 담을 int 형 변수를 try 문 실행전에 선언을 해준다
			 * 
			 * try 문이 끝난 다음에 3과목의 점수를 scList 에 담아야하는데 try문 내에서 선언되면
			 */
			int intkor = 0;
			int inteng = 0;
			int intmath = 0;
			try {

				System.out.print((i + 1) + "번 국어 수학 영어>>");
				String setkor = scan.nextLine();
				intkor = Integer.valueOf(setkor);

				System.out.print((i + 1) + "번 국어 수학 영어>>");
				String seteng = scan.nextLine();
				inteng = Integer.valueOf(seteng);

				System.out.print((i + 1) + "번 국어 수학 영어>>");
				String setmath = scan.nextLine();
				intmath = Integer.valueOf(setmath);

			} catch (NumberFormatException e) {
//					e.printStackTrace();
				System.out.println((i + 1) + "번 점수 학생 입력오류.");
				System.out.println((i + 1) + "번 점수 학생 다시 입력.");
				i--;
				
				/*
				 * for 나 whlie 반복문내에서 사용할수 있으며
				 * contin를 만나면 이후에 있는 모든것들을 무시하고
				 * for 나 whlie 문의 시작점으로 점프
				 * break은 반복문 종료
				 * continue는 반복문을 게속 진행 
				 */
				continue;
			}

			int inttotal = intkor + inteng + intmath;
			int average = inttotal / 3;

			scList.add(new ScoreVO("" + (i + 1), intkor, inteng, intmath, inttotal, average));

		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());

		}
		int scLen = scList.size();
		for (int i = 0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);
			int totol = vo.getKor();
			totol += vo.getEng();
			totol += vo.getMath();
		}

		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());

		}

	}

}
