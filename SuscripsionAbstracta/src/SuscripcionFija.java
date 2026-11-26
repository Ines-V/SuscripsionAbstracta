public class SuscripcionFija extends Suscripcion{
    private double cuotaMensual;

    //constructor
    public SuscripcionFija(String nombreUsuario, double cuotaMensual) {
        super(nombreUsuario);
        if (cuotaMensual<0){//Si la cuota es negativa salta error.
            throw new IllegalArgumentException("La cuota no puede ser negativa.");
        }else {
            this.cuotaMensual = cuotaMensual;
        }
    }

    //Getter y Setter
    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String toString() {
        return "SuscripcionFija{" +
                "cuotaMensual=" + cuotaMensual +
                '}';
    }

    @Override
    public double calcularCuotaMensual() {
        return cuotaMensual;
    }
}
