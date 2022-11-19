package util;

public class ConversorMoeda {
    public static final double IOF = 1.06;

    public static double conversor(double precoDolar, double qtdDolar){
        return precoDolar * qtdDolar * IOF;
    }
}
