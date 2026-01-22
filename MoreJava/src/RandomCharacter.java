import java.util.*;

public class RandomCharacter {

    public static char getRandomCharacter(char ch1, char ch2) {
        Random rd = new Random();
        return (char) (char) (rd.nextInt(ch2 - ch1 +1) + ch1);
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        Random rd = new Random();
        return (char) ('0' + rd.nextInt(10));
    }

    public static char getRandomCharacter(int choice) {
        Random rd = new Random();
        switch (choice) {
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            case 2:
                return getRandomDigitCharacter();
            case 3: //ngẫu nhiên
                int randomChoice = rd.nextInt(3);
                if (randomChoice == 0) return getRandomLowerCaseLetter();
                else if (randomChoice == 1) return getRandomUpperCaseLetter();
                else return getRandomDigitCharacter();

            default:
                return ' ';
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhập lựa chọn (0: chữ thường, 1: chữ hoa, 2: chữ số, 3: ngẫu nhiên): ");
            choice = sc.nextInt();
        }while(choice<0 || choice>3);

        System.out.println("50 ký tự ngẫu nhiên:");
        for (int i = 0; i < 50; i++) {
            System.out.print(getRandomCharacter(choice) + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
