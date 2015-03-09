/**
 * Created by proton on 22.02.2015.
 */
public class Main {

    public static void main(String[] args) {

        //создаю массив из случайных чисел
        int []arr = new int [10];

        for (int i=0; i < 10; i++) {
            arr[i] = (int)(Math.random()*20+1);
        }

        //вывожу полученный массив
        System.out.println("заданный массив: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //вызываю метод сортировки
        puzir(arr, "по возрастанию");

        puzir(arr, "по убыванию");

    }

    //метод сортировки, принимает на вход массив и параметр который задает тип сортировки
    public static void puzir (int[] arr, String par) {

        //если параметр "по возрастанию" провожу сортировку по возрастанию
        if (par.equals("по возрастанию")) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int d = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = d;
                }
            }
        }
            System.out.println();

            //вывожу отсортированный массив
            System.out.println ("отсортированный массив по возрастанию: ");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        //если параметр "по убыванию" провожу сортировку по убыванию
        if (par.equals("по убыванию")) {

            //реализация метода работы с копией массива
            //создаю новый массив на тоже количество илементов что и оригинальный
            int[] add = new int[arr.length];

            //произвожу копирование элементов между массивами
            for (int i = 0; i < arr.length; i++) {
                add[i] = arr[i];
            }

            System.out.println ("первоначальный массив: ");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i < add.length; i++) {

                for (int j = 0; j < add.length - 1; j++) {

                    if (add[j] < add[j + 1]) {
                        int d = add[j];
                        add[j] = add[j + 1];
                        add[j + 1] = d;
                    }
                }
            }
            System.out.println();

            //вывожу отсортированный массив
            System.out.println ("отсортированный массив по убыванию: ");

            for (int i = 0; i < add.length; i++) {
                System.out.print(add[i] + " ");
            }
            System.out.println();


        }
    }
}
