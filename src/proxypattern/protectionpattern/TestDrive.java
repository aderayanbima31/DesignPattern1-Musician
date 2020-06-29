package proxypattern.protectionpattern;

public class TestDrive {

    public static void main(String[] args) {
        WeatherForecast weatherForecastContent = new WeatherForecastContent("Forecast today - In Jakarta, rainy with lightning");
        WeatherForecast weatherForecastReader = WeatherForcastAccess.getForecastReader(weatherForecastContent);
        System.out.println("Read : " + weatherForecastReader.getWeatherForecastContent());
        try {
            weatherForecastReader.setWeatherForecastContent("Write : This is fake news");
        } catch (Exception e) {
            System.out.println("Write : You don't have authority to re-write the news");
        }

        System.out.println();
        WeatherForecast weatherForecastWriter = WeatherForcastAccess.getForecastWriter(weatherForecastContent);
        weatherForecastWriter.setWeatherForecastContent("Forecast today - In Jakarta, rainy with Miaw");


        try {
            System.out.println("Read : " + weatherForecastWriter.getWeatherForecastContent());
        } catch (Exception e) {
            System.out.println("Write : You don't have authority to re-write the news");
        }

        System.out.println("Read : " + weatherForecastReader.getWeatherForecastContent());

    }
}
