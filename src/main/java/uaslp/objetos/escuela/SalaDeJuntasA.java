package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas{
    private static SalaDeJuntasA instance;
    public static SalaDeJuntasA getInstance(){
        if(instance==null){
            instance=new SalaDeJuntasA();
        }
        return instance;
    }
    @Override
    public String getNombre() {
        return "Sala A";
    }
}
