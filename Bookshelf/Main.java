/**
 * Created by user on 02.03.2015.
 */
public class Main {
    
    public static void main (String[] args) {

        //создаю экземпляр класса Bookshelf
        Bookshelf book1 = new Bookshelf();
        //создаю копию ссылки на book1
        Bookshelf book2 = book1;

        //сравниваю сылки book1 == book2
        System.out.println(book1 == book2);

        //сравниваю сылки book1 == book2 при помощи equals, он уже переопределен в Bookshelf
        System.out.println(book1.equals(book2));

        //создаю еще один экземпляр класса Bookshelf
        Bookshelf book3 = new Bookshelf();

        //сравниваю два разных экземпляра класса Bookshelf
        System.out.println(book1.equals(book3));

    }

}
