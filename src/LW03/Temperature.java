package LW03;

public class Temperature {

    private double celsius;
    private double fahrenheit;

    public Temperature(){
        System.out.println("Temperature Created");
    }

    public Temperature(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public void getCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void getFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setFahrenheit(){
        this.fahrenheit = this.celsius * 9 / 5 + 32;
    }

    public void setCelsius(){
        this.celsius = (this.fahrenheit - 32) * 5 / 9;
    }

    public double toFahrenheit(){
        return this.fahrenheit;
    }

    public double toCelsius(){
        return this.celsius;
    }

}
