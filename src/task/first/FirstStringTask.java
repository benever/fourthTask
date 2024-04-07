package task.first;

import java.util.Scanner;

public class FirstStringTask {
    public static void main(String[] args) {
        //4.1
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = in.nextLine();

        System.out.println("Введите подстроку");
        String substr = in.nextLine();

        int i, n = 0;
        for (int j = 0; j < str.length(); j++) {
            if(str.contains(substr)){
                i = str.indexOf(substr);
                str = str.substring(i+2);
                n++;
            }
        }
        System.out.printf("Подстрока '%s' встречается %d раза",substr,n);
    }
}
