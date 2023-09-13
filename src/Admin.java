public class Admin extends Usuario{
    private String claveAdmin;
    public Admin(String nombre, String correoElectronico, String claveAdmin){
        super(nombre,correoElectronico);
        this.claveAdmin=claveAdmin;
    }

    public String getClaveAdmin() {
        return claveAdmin;
    }

    public void setClaveAdmin(String claveAdmin) {
        this.claveAdmin = claveAdmin;
    }
    void asignarCodigoPerfil(){
        System.out.println("¡He asignado un codigo de perfil!");
    }
    void mostrarContenido(){
        System.out.println("Soy el cajero "+ getNombre()+" mi correo eletronico es "+getCorreoElectronico()+" y mi clave admin es "+ getClaveAdmin());
    }
}
