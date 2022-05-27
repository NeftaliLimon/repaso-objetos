package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura {
    private double lado;
    private double area;
    private int numeroDeLados;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        double perimetro;
        double apotema;
        double anguloCentral;
        perimetro=numeroDeLados*lado;
        anguloCentral=360/numeroDeLados;
        apotema=lado/(2*Math.tan(Math.toRadians(anguloCentral/2)));
        area=(perimetro*apotema)/2;
        return area;
    }

    public double getLado() {
        return lado;
    }

    public PoligonoRegular(int numeroDeLados, double lado){

        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados=numeroDeLados;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}

