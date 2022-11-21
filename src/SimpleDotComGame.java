import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        SimpleDotCom sdc = new SimpleDotCom();
        sdc.setLocationCells(createArray());
        boolean isAlive = true;
        while (isAlive) {
            System.out.println("Введите число: ");
            String guess = scanner.nextLine();
            String result = sdc.checkYourself(guess);
            System.out.println(result);
            ++numOfGuesses;
            if (result.equals("потопил")) {
                isAlive = false;
            }
        }
        System.out.println("You are winner!!! Your score: " + numOfGuesses);
    }

    private static int[] createArray() {
        int[] field = new int[8];
        field[2] = 2;
        field[3] = 3;
        field[4] = 4;
        return field;
    }
}
