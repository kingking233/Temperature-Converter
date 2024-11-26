public class Convention {
    double results;

    //from Degree
    public double degreeToKelvin(double x) {
        results = x + 273.15;
        return results;
    }

    public double degreeToFahrenheit(double x){
        results=(x * 1.8)+32;
        return results;
    }

    //from Kelvin
    public double kelvinToDegree(double x){
        results= x-273.15;
        return results;
    }

    public double kelvinToFahrenheit(double x){
        results =(x-273.15)*1.8 +32;
        return results;
    }

    //from Fahrenheit
    public double FahrenheitToDegree(double x){
        results=(x-32)*0.556;
        return results;
    }
    public double FahrenheitToKelvin(double x){
    results =(x-32)*0.556+273.15;
        return results;
    }
}
