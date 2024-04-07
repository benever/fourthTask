package task.fourth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTask {
    public static void main(String[] args){
        //4.4
        System.out.println("Введите дату в формате 'дд.мм.гггг'");

        Scanner in = new Scanner(System.in);
        String date = in.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date2;

        try {
            date2 = dateFormat.parse(date);
            SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(newDateFormat.format(date2));
        }catch (ParseException e){
            System.out.println("Неверный формат даты");
        }


    }
}
