import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WeatherMan forecaster = new WeatherMan();

        // save days of the week to a list
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");

        System.out.println("Next week's weather forecast");

        // loop the days list
        for (String day : days) {
            // create a string and store the forecase probability in it
            String weatherForecast = forecaster.forecast();

            // create an integer and store the random forecasts in it
            int temperatureForecast = forecaster.makeAForecast();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }
    }
}