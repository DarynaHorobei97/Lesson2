public class Main {

    static int a = 6;

    static void showText(String word) {

    }

    static void showText(int number) {
        System.out.println(number);
    }

    static void showText(String letter, int number) {
        System.out.println(letter);
    }

    static void showText(int number, String letter) {
        System.out.println(letter);
    }


    public static void main(String[] args) {

        showText(5, "fghjk");

    }

}