public abstract class Suscripcion{
    private String nombreUsuario;

    //Constructor
    public Suscripcion(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //Getter y setter
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //Metodo abstracto
    public abstract double calcularCuotaMensual();

    //Metodo concreto
    public void mostrarUsuario(){
        System.out.println("Nombre del usuario: "+nombreUsuario);
    }
}
