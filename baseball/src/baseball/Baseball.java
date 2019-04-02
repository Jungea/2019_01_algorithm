/*
 * 작성자: 정은애
 * 작성일: 2019.04.02.
 * 야구게임 작성
 */

package baseball;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String com; // 컴퓨터가 생성한 숫자
		String my; // 입력한 숫자
		int bCount; // 볼
		int sCount; // 스트라이크
		String result; // 결과 출력
		int opt; // 새로운 게임 진행 선택 변수

		do { // 전체 게임 반복
			com = makeCom();
			System.out.println(com);

			do { // 한 게임의 반복
				bCount = 0;
				sCount = 0;
				result = "";

				System.out.print("숫자를 입력: ");
				my = scan.next();

				for (int i = 0; i < com.length(); i++) {
					if (my.charAt(i) == com.charAt(i)) // 스트라이크 판단
						sCount++;
					else if (contains(com, my.charAt(i))) // 볼 판단
						bCount++;
				}

				// 판정 결과 문자열 만들기
				if (sCount == 3)
					result += "정답";

				else {
					if (sCount == 0 && bCount == 0)
						result += "아웃";

					else {
						if (sCount > 0)
							result += (sCount + "스트라이크 ");
						if (bCount > 0)
							result += (bCount + "볼");
					}
				}
				System.out.println(result);

			} while (sCount != 3); // 정답=스트라이크3개면 한 게임 종료

			System.out.print("게임을 계속하시겠습니까? (1=계속, 0=종료): ");
			opt = scan.nextInt();
		} while (opt != 0); // 야구게임 종료

		System.out.println("종료!");
	}

	public static String makeCom() { // 컴퓨터가 랜덤 숫자 생성
		Random random = new Random();
		String com = "";
		int value;
		char vChar;
		while (com.length() != 3) {
			value = random.nextInt(10);
			vChar = Integer.toString(value).charAt(0);
			if (!contains(com, vChar))
				com += vChar;
		}

		return com;

	}

	public static boolean contains(String s, char c) { // 해단 문자열에 문자 포함 여부
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				return true;

		return false;
	}

}
