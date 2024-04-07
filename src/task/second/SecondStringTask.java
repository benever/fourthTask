package task.second;

import java.util.Arrays;
import java.util.Scanner;

public class SecondStringTask {
    public static void main(String[] args) {
        System.out.println("Введите строку");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String replace;
        replace = str.replace("бяка", "вырезано цензурой");
        replace = replace.replace("кака","вырезано цензурой");

        System.out.println(replace);
    }
}
