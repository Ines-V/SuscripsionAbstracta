public class SuscripcionPorUso extends Suscripcion{
    private double gigasConsumidos;
    private double precioPorGiga;

    //Constructor
    public SuscripcionPorUso(String nombreUsuario, double gigasConsumidos, double pregioPorGiga) {
        super(nombreUsuario);
        if (gigasConsumidos<0){
            throw new IllegalArgumentException("Los gigas consumidos no pueden ser negativos.");
        }else{
            this.gigasConsumidos = gigasConsumidos;
        }
        this.precioPorGiga = pregioPorGiga;
    }

    //Getter y Setter
    public double getGigasConsumidos() {
        return gigasConsumidos;
    }

    public void setGigasConsumidos(double gigasConsumidos) {
        this.gigasConsumidos = gigasConsumidos;
    }

    public double getPrecioPorGiga() {
        return precioPorGiga;
    }

    public void setPrecioPorGiga(double pregioPorGiga) {
        this.precioPorGiga = pregioPorGiga;
    }

    @Override
    public String toString() {
        return "SuscripcionPorUso{" +
                "gigasConsumidos=" + gigasConsumidos +
                ", pregioPorGiga=" + precioPorGiga +
                '}';
    }

    @Override
    public double calcularCuotaMensual() {
        return gigasConsumidos*precioPorGiga;
    }
}
