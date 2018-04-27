import java.util.Objects;

public class SimpleCalculator {
    private String name;

    public SimpleCalculator(String name){
        this.name = name;
    }

    public double addition(double a, double b){
        double res = Math.round((a+b)*100);
        return res/100;
    }

    public double subtraction(double a, double b){
        double res = Math.round((a-b)*100);
        return res/100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCalculator that = (SimpleCalculator) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
