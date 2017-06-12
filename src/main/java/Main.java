import com.calvin.soap.client.GlobalWeather;
import com.calvin.soap.client.GlobalWeatherLocator;

public class Main {
    public static void main(String[] args) throws Exception {
        GlobalWeather service = new GlobalWeatherLocator();
        String groupsJSON = service.getGlobalWeatherSoap().getCitiesByCountry("canada");
        System.out.println(groupsJSON);
    }
}
