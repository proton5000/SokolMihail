import java.util.Scanner;

/**
 * Created by proton on 21.02.2015.
 */
public class Main {

    public static void main (String[] args) {

        //массивы для провеки прогрессий
        int[] arr = {1, 3, 5, 7, 9, 11};
        int[] arr1 = {1, 2, 4, 8, 16, 32};

        //создание экземпляра класса в котором определяються прогрессии
        Progression pro = new Progression();

        //вызываем методы для определения типов прогрессий
        pro.arifmetic(arr);
        pro.geometric(arr1);
    }

}
