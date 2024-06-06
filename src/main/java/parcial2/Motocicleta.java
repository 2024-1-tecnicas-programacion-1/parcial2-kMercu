package parcial2;

public class Motocicleta extends Vehiculo {
    
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
    @Override
    public String imprimirInformacion(){
        super.imprimirInformacion();
        return "";
    }
}
