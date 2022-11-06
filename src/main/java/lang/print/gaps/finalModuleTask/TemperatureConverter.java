package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahr= (float) (temperatureCelsius*1.8+32);
        System.out.println(fahr);
    }
}
