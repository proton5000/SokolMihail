/**
 * Created by proton on 02.03.15.
 */
public class SelfSifexCar extends Car {

    //метод move который в случайном порядке двигает 40% машин быстрее, остальные 60% едут как обычно
    public void move() {
        position += speed;
        if (brake) {

            brake = false;

        } else {

            if ((Math.random()*100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }

            if ((Math.random()*100) > 98) {

                brake = true;

            }
        }
    }

    //конструктор класса Car который на вход принимает имя гонщика, остальные данные в нем уже есть
    public SelfSifexCar(String name) {
        super(name);
    }

    //переопределяю метот String для вывода сообщения при отрабатывании экземпляра класса SelfSifexCar
    public String toString() {
        return "Гонщик " + name + " со скоростью : " + speed + " n2o " + n2o;
    }

}
