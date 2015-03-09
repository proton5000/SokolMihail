/**
 * Created by user on 26.02.2015.
 */
public class Main {

    public static void main(String[] args) {

        //создаю массив машин, передаю имя кадому гонщику машины
        Car[] cars = {new Car("Mike"), new Car("Elis"), new Car("Tom"), new Car("Smit"), new SelfSifexCar("Turbo")};

        //создаю экземпляр класса Race с длинной трассы и передаю в него массив с машинами
        Race myRace = new Race(500, cars);

        //запускаю метод start класса Race
        myRace.start();

    }

}

