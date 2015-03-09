/**
 * Created by user on 26.02.2015.
 */
public class Car {

    //переменные класса Car
    int position;
    int n2o;
    int speed;
    String name;
    boolean brake = false;

    //метод move который в случайном порядке двигает 40% машин быстрее, остальные 60% едут как обычно
    public void move() {

        if (brake) {
//            position += 0;

        } else {

            if ( (Math.random()*100) > 60 ) {
                position += speed + n2o;
            } else {
                position += speed;
            }

            if ( (Math.random()*100) > 98 ) {
                brake = true;
            }
        }
    }

    //конструктор класса Car который на вход принимает имя гонщика, остальные данные в нем уже есть
    public Car(String name) {
        n2o = 20;
        speed = 10;
        position = 0;
        this.name = name;
    }

    //переопределяю метот String для вывода сообщения при отрабатывании экземпляра класса Car
    public String toString() {
        return "Гонщик " + name + " со скоростью : " + speed + " n2o " + n2o;
    }


}
