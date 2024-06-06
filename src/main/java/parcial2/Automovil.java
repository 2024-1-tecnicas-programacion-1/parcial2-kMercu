package parcial2;

public class Automovil extends Vehiculo{

    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String imprimirInformacion(){
        super.imprimirInformacion();
        return "";
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    
}
