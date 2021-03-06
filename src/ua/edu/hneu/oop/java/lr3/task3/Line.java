package ua.edu.hneu.oop.java.lr3.task3;

import java.util.HashMap;
import java.util.Map;

public class Line extends Function {
    private double a, b;

    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return a * x + b;
    }

    @Override
    public Map<String, Double> getParameters() {
        Map<String, Double> params = new HashMap<>();
        params.put("a", a);
        params.put("b", b);
        return params;
    }

    @Override
    public String toString() {
        return "a*x + b";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
