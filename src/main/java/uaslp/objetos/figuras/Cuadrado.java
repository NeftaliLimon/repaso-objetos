package uaslp.objetos.figuras;

public class Cuadrado implements Figura {

    private double lado;
    private double area;

    public Cuadrado(){

    }

    void setLado(double lado){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado = lado;

    }

    public double getArea() {
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        area=lado*lado;
        return 0;
    }

    public Cuadrado(double lado){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado=lado;

    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }
}
