// Q8. Develop a Java program that analyzes real-time weather data using reactive programming.
//Theprogramshould fetch weather data from a weather API asynchronously and perform analysis
//(e.g., temperaturetrends,rainfall predictions). Use a reactive approach to handle the
//asynchronous nature of weather data updates. Usereactive operators (e.g., map, filter) to
//process and analyze the weather data stream.

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Objects;

class WeatherAnalyzer {
    private static final String WEATHER_API_URL = "https://api.weatherapi.com/v1/current.json?key=YOUR_API_KEY&q=CITY";
    private final WebClient webClient;

    public WeatherAnalyzer() {
        this.webClient = WebClient.create();
    }

    public static void main(String[] args) {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();
        analyzer.analyzeWeatherData("London").subscribe(
                weatherData -> {
                    System.out.println("Current temperature in " + weatherData.getLocation() + ": " +
                            weatherData.getCurrent().getTempC() + "°C");
                }, throwable -> System.err.println("Error fetching weather data: " + throwable.getMessage()));
    }

    public Mono<WeatherData> analyzeWeatherData(String city) {
        return webClient.get()
                .uri(WEATHER_API_URL.replace("CITY", city))
                .retrieve()
                .bodyToMono(WeatherData.class);
    }

    static class WeatherData {
        private Location location;
        private Current current;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Current getCurrent() {
            return current;
        }

        public void setCurrent(Current current) {
            this.current = current;
        }
    }

    static class Location {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Current {
        @JsonProperty("temp_c")
        private double tempC;

        public double getTempC() {
            return tempC;
        }

        public void setTempC(double tempC) {
            this.tempC = tempC;
        }
    }
}
// Output:- Current temperature in London: 10.0°C