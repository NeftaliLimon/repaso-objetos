package uaslp.objetos.figuras;

public class Triangulo implements Figura {

    private double base;
    private double altura;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getArea() {
        area = (base * altura) / 2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }

    public Triangulo(){

    }

    public String getDescription() {
        return "Cualquier triangulo";
    }

    @Override
    public String getName() {
        return "Triangulo";
    }
}
