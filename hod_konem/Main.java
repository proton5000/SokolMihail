import java.util.Scanner;

/**
 * Created by proton on 22.02.2015.
 */
public class Main {

    public static void main (String[] args) {

        //запрашиваем координаты хода у пользователя
        System.out.println("Введите ваш ход: ");

        Scanner scn = new Scanner(System.in);

        String read = scn.nextLine();

        Detect hod = new Detect();

        //вызываем метод определения верного хода
        System.out.println(hod.kon(read));

    }

}
