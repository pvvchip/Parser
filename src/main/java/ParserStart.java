import java.util.HashSet;

public class ParserStart {
    private static HashSet<String> hsURL;
    private static Link myLink = new Link();
    private static Url myUrl = new Url();

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("--------------------------------");

        hsURL = myLink.getLink(myUrl.getUrl(), "");

        for (String i: hsURL) {
            System.out.println(i);
        }

        System.out.println(hsURL.size());
    }
}
