public class MainSuscripcion {
    static void main(String[] args) {
        Suscripcion[] suscipcion={
                new SuscripcionFija("Pepe",200),
                new SuscripcionPorUso("Maria",34,1),
                new SuscripcionFija("Juan",50)
        };

        double totalCuotas=0;

        //Sumar todas las cuotas correctas.
        for(Suscripcion s:suscipcion){
            s.mostrarUsuario();
            double cuota= s.calcularCuotaMensual();
            totalCuotas+=cuota;
        }
        System.out.println("Total cuotatas: "+totalCuotas);

        try{
            SuscripcionFija suscripcionMala=new SuscripcionFija("Lucia",-25);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
