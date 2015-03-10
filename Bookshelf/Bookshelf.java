/**
 * Created by user on 02.03.2015.
 */
public class Bookshelf {

    int height;
    int width;

    //переопределение метода equals
    //теперь он учитывает поля класса Bookshelf
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bookshelf bookshelf = (Bookshelf) o;

        if (height != bookshelf.height) return false;
        if (width != bookshelf.width) return false;

        return true;
    }

    //переопределяю метод hashCode
    //теперь он ипользует поля класса Bookshelf и случайное число 55 для вычисления самого hashCode
    @Override
    public int hashCode() {
        int result = height;
        result = 55 * result + width;
        return result;
    }
}
