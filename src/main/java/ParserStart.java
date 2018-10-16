import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ParserStart {
    public static void main(String[] args) {
        System.out.println("Hi!");

        String url = "http://www.goodsmatrix.ru/goods/h/4690363012190.html";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = doc.title();
        System.out.println(title);
    }
}
