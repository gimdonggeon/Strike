package version1;

import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

public class RandomNumberGenerator {
    private Set<Integer> ballNum;
    public RandomNumberGenerator(){
        ballNum = new LinkedHashSet<>();        //순서가 있고, 중복 불가한 LinkedHashSet 사용
    }
    public void setBall() {
        Random randomNumber = new Random();
        while(ballNum.size() < 3) {
            ballNum.add(randomNumber.nextInt(9)+1);  // ballNum으로 난수 3개 입력 완료
        }
    }
    public Set<Integer> getAnswer() {
        return ballNum;
    }
}





