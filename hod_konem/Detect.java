import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by proton on 22.02.2015.
 */
public class Detect {

    public boolean kon(String s) {

        // правильный ход C7D5
        // не правильный ход E2E4
        // не правильный ход D9N5 - выход за границы шахматной доски

        //флаг показывающий верность хода
        boolean res = false;
        
        //разбиваем координаты на 4 символа
        char t1 = s.charAt(0);
        char t2 = s.charAt(1);
        char t3 = s.charAt(2);
        char t4 = s.charAt(3);

        //проверяем что пользователь не попал за грани шахмотной доски
        if ( t2 > '8' | t4 > '8' | t1 > 'H' | t3 > 'H' ) {

            System.out.println("Вы вышли за грани шахматной доски");

        //если пользователь в зоне шахмотной доски то
        //проверяем правильность хода
        } else {

            if ((t1-t3 == 1 | t3-t1 == 1) && (t2-t4 == 2 | t4-t2 == 2)) {

                res = true;

            }

            if ((t1-t3 == 2 | t3-t1 == 2) && (t2-t4 == 1 | t4-t2 == 1)) {

                res = true;
            }

        }

        //возвращаем значение флага
        return res;
    }

}
