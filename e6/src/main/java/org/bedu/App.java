package org.bedu;

import org.bedu.util.Axios;

public class App {

    public static void main(String[] args) {
        Axios axios = new Axios();
        Weather weather = new Weather(axios);

        double currentWeather = weather.currentWeather(12.865416, -85.207230);
        System.out.println(currentWeather);
    }
}