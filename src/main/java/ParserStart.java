import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashSet;

public class ParserStart {
    private static Document doc;
    private static HashSet<String> hsURL;

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("--------------------------------");

        conect();
        getCatalogue();

        for (String i: hsURL) {
            System.out.println(i);
        }
    }

    private static void conect() {
        GetURL url = new GetURL();
        hsURL = new HashSet<String>();

        try {
            doc = Jsoup
                    .connect(url.getUrl())
                    .userAgent("Mozilla/5.0 (Windows; U; MSIE 9.0; Windows NT 8.1; Trident/5.0; .NET4.0E; en-AU)")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void getCatalogue() {
        Elements links = null;
        if (doc != null) {
            links = doc.select("a[href]");
        }

        if (links != null) {
            for (Element link : links) {
                String target = link.attr("abs:href");
                if (target.startsWith("http://goodsmatrix.ru/goods-catalogue/")) {
                    hsURL.add(target);
                }
            }
        }
        System.out.println("Total Linck: " + hsURL.size());
    }
}
