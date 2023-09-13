public class Cajero extends Usuario{
    private String claveCajero;
    public Cajero(String nombre, String correoElectronio, String claveCajero){
        super(nombre,correoElectronio);
        this.claveCajero=claveCajero;
    }

    public String getClaveCajero() {
        return claveCajero;
    }

    public void setClaveCajero(String claveCajero) {
        this.claveCajero = claveCajero;
    }
    void registarVenta(){
        System.out.println("¡Registré una venta!");
    }
    void mostrarContenido(){
        System.out.println("Soy el cajero "+ getNombre()+" mi correo eletronico es "+getCorreoElectronico()+" y mi clave cajero "+ getClaveCajero());
    }
}
