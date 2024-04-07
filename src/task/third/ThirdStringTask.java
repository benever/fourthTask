package task.third;

import java.util.Scanner;

public class ThirdStringTask {
    public static void main(String[] args) {
        //4.3
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();

        String day, month, year;
        day = date.substring(0,2);
        month = date.substring(3,5);
        year = date.substring(6,10);

        String newFormatDate = year + "-" + month + "-" + day;
        System.out.println(newFormatDate);
    }
}
