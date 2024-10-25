package version1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseballGame {
    static Scanner sc = new Scanner(System.in);

    public void gameStart() {
        RandomNumberGenerator randNum = new RandomNumberGenerator();
        randNum.setBall();
        System.out.println("숫자야구게임");
        System.out.println("1. 게임시작 2.게임 종료");
        int startOrEnd = sc.nextInt();
        if (startOrEnd == 1) {
            System.out.println("게임을 시작합니다.");
            Set<Integer> answerNumber = randNum.getAnswer();
            int strike = 0;
            int ball = 0;
            //문장 반복
            while (strike < 3) {
                // 숫자입력
                System.out.println("숫자 3개를 입력하세요");
                String threenumber = sc.next();
                // 스트라이크 볼 판단
                // 123
                // 345 1b
                // 숫자 하나를 뽑음(앞에서부터)
                String[] strArr = threenumber.split("");
                strike = 0;
                ball = 0;
                String firstNumber = strArr[0];
                int firstChoiceNumber = Integer.parseInt(firstNumber);
                // 답과 쪼개진 숫자가 값과 자리가 같으면 Strike를 출력
                // 답의 값만 같으면 Ball을 출력 판단을 내리고
                // 끝자리까지 반복


                for (int i = 0; i < strArr.length; i++) {
                    int inputNum = Integer.parseInt(strArr[i]);
                    int answerIdx = i;

                    if (answerNumber.contains(inputNum)) {
                        if (inputNum == (Integer) answerNumber.toArray()[answerIdx]) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
                System.out.println(strike + "Strike, " + ball + " Ball");
                if (strike == 3) {
                    System.out.println("게임 종료! 정답입니다!!");
                    break;
                }
            }
        } else if (startOrEnd == 2) {
            System.out.println("게임을 종료합니다.");
        }
    }
}
