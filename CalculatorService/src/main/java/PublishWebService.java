import javax.xml.ws.Endpoint;
import webService.WebCalculator;

public class PublishWebService {

    private static final String url = "http://localhost:8080/WebCalculator";

    public static void main(String[] args) {
        Endpoint.publish(url, new WebCalculator());
    }
}
