import java.util.HashSet;

public class ParserStart {
    private static final Link myLink = new Link();
    private static final Url myUrl = new Url();

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("--------------------------------");

        HashSet<String> hsURL = myLink.getLink(myUrl.getUrl(), "");

        for (String i: hsURL) {
            System.out.println(i);
        }

        System.out.println(hsURL.size());
    }
}
