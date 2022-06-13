package Netologia.FieldWonderful;

import java.util.Scanner;

public class FieldWonderful {
    /**
     * Game of The "Field of Wonderful"
     * Begin 11.06.2022
     */

    static String word = "javaforever";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Угадай слово:");
        int lengthWord = word.length();
        String maskWord = "-".repeat(lengthWord);
        System.out.println(maskWord);

        do {
            System.out.println("Введите букву:");
            char c = in.next().charAt(0);
            if (word.indexOf(c) >= 0) {
                System.out.println("Успех. Такая буква есть в слове!");
                for (char el : word.toCharArray()) {
                    if (el == c) {
                        maskWord = replaceMaskLetter(c, maskWord);
                    }
                }
                System.out.println(maskWord);
            }  else {
                    System.out.println("Такой буквы нет в слове. Попробуйте еще раз");
                    System.out.println(maskWord);
                }
        } while (maskWord.contains("-"));
          System.out.println("Поздравляем ты выиграл");
    }

    public static String replaceMaskLetter(char c, String maskWord) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                str.append(c);
            } else if (maskWord.charAt(i) != '-') {
                str.append(maskWord.charAt(i));
            } else {
                str.append("-");
            }
        } return str.toString();
    }
}