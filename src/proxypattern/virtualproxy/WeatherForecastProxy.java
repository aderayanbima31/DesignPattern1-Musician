package proxypattern.virtualproxy;

public class WeatherForecastProxy implements NewsContract {

    boolean alreadyLoaded;

    WeatherForecast weatherForecast;

    @Override
    public void init() {
        if (weatherForecast != null){
            weatherForecast.init();
        }else{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Loading weather forecast, Please wait. . .");
        weatherForecast = new WeatherForecast();
        weatherForecast.showNews();
        alreadyLoaded = true;
    }
    }

    @Override
    public void showNews() {
        if(alreadyLoaded){
            weatherForecast.showNews();
        }else{
            System.out.println("Loading weather forecast, Please wait. . .");
            weatherForecast = new WeatherForecast();
            weatherForecast.showNews();
            alreadyLoaded = true;
        }
    }
}
