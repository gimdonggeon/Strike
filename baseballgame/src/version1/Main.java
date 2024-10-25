package version1;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        BaseballGame bg = new BaseballGame();
        System.out.println(rng.getAnswer());
        bg.gameStart();
    }
}