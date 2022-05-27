package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;
    private double area;

    public Cuadrado(){

    }

    void setLado(double lado){
        this.lado = lado;
    }

    public double getArea() {
        area=lado*lado;
        return 0;
    }

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }
}
