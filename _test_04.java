package dd;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class _test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LOTTO 생성
		int[] lotto = new int[6];
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int lottoReturn = 0;
		int correct = 0;
		int loNum = 6;

		// 로또 번호 입력

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rand.nextInt(loNum) + 1;

// 로또 번호 중복검사
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i = i - 1;

				}


			}

		}
		lottoReturn = 0;

		int[] myLotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			if (lottoReturn == 1) {
// 롯또 번호 중복이 발견되면 i 값 재입력
				System.out.println("error) *같은 수를 입력하실 수 없습니다.*");
				i = i - 1;
				lottoReturn = 0;
			}
			System.out.println(i + 1 + "번째 로또 번호를 입력하세요.");
			myLotto[i] = sc.nextInt();

			//
			for (int j = 0; i > j; j++) {
				if (myLotto[i] == myLotto[j]) {
					lottoReturn = 1;

				}
			}
		}

		// 롯또번호 비교
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j <= 5; j++) {
				if (myLotto[j] == lotto[i]) {
					correct += 1;
					break;

				}

			}

		}

		if (correct == 6) {
			System.out.println("모두 정답입니다.");

		} else {
			System.out.println("맟춘 횟수 " + correct + "회");
		}
		System.out.print("로또 정답 ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("나의 입력 ");
		System.out.println(Arrays.toString(myLotto));

	}

}
