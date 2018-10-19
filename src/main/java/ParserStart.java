import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParserStart {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("--------------------------------");

        String url;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/url.txt"));
//            while ((st = br.readLine()) != null) {
//                ta.append(st);
//            }
            url = "http://" + br.readLine();
            System.out.println(url);
            br.close();
        } catch (IOException e) {
            System.out.println("File not: url.txt");
            return;
        }

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = null;
        if (doc != null) {
            title = doc.title();
        }
        System.out.println(title);

        Elements elements = doc.getElementsByTag("a");
        for (Element i: elements) {
            String value = i.attr("href");
            String text = i.text();
            System.out.println(text);
            System.out.println("\t" + value);


        }
    }
}
