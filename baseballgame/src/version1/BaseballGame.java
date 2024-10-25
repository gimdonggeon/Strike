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
        if(startOrEnd==1) {
            System.out.println("게임을 시작합니다.");
            // 숫자입력
            System.out.println("숫자 3개를 입력하세요");
            String threenumber = sc.next();
            // 스트라이크 볼 판단
                // 123
                // 345 1b
                // 숫자 하나를 뽑음(앞에서부터)
            Set<Integer> answerNumber = randNum.getAnswer();
            String[] strArr = threenumber.split("");
            String firstNumber = strArr[0];
            int firstChoiceNumber = Integer.parseInt(firstNumber);
                // 답과 쪼개진 숫자가 값과 자리가 같으면 Strike를 출력
                // 답의 값만 같으면 Ball을 출력
            Integer[] answerArray = answerNumber.toArray(new Integer[0]);
            for(int i = 0; i < strArr.length; i++) {
                int currentChoiceNumber = Integer.parseInt(strArr[i]);

                if (currentChoiceNumber == answerArray[i]) {
                    System.out.println("스트라이크");
                }else if (answerNumber.contains(currentChoiceNumber)) {
                    System.out.println("볼");
                }
            }

                // 판단을 내림
                // 끝자리까지 반복


            // 화면 출력
            // 위 과정 반복
        }else if(startOrEnd==2){
            System.out.println("게임을 종료합니다.");
        }




    }

}
