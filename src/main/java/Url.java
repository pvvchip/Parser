import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Url {
    private String url;
    private String filter;

    Url() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/main/resources/url.txt"));
            url = br.readLine();
            filter = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("File not: url.txt");
        }
    }

    String getUrl() {
        return url;
    }
    String getFilter() {
        return filter;
    }
}
