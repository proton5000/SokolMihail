
/**
 * Created by user on 02.03.2015.
 */
public class Main {

    public static void main (String[] args) {

//        News news = new News();
//        news.typePublication();
//        news.publish();

//        Article article = new Article();
//        article.typePublication();
//        article.publish();

//        Announcement announcement = new Announcement();
//        announcement.typePublication();
//        announcement.publish();

        Publication[] rrr =  { new News(), new Article(), new Announcement()};

        for (int i = 0; i < rrr.length; i++) {

            rrr[i].publish();

        }

    }

}
