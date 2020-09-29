import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashSet;

public class Link {

    public HashSet<String> getLink(String url, String filter) {

        Document doc = new Document(url);
        HashSet<String> hsLink = new HashSet<String>();
        HashSet<String> hsLink_2 = new HashSet<String>();

        try {
            doc = Jsoup
                    .connect(url)
                    .userAgent("Mozilla/5.0 (Windows; U; MSIE 9.0; Windows NT 8.1; Trident/5.0; .NET4.0E; en-AU)")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element content_1 = doc.getElementById("ctl00_ContentPH_GoodsName");
        Element content_2 = doc.getElementById("ctl00_ContentPH_BarCodeL");
        Element content_3 = doc.getElementById("ctl00_ContentPH_Composition");
        Element content_4 = doc.getElementById("ctl00_ContentPH_ESL");
        System.out.println(content_1.text());
        System.out.println(content_2.text());
        System.out.println(content_3.text());
        System.out.println(content_4.text());



        return hsLink;
    }

}
