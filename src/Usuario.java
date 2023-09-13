public class Usuario {
    private String nombre;
    private String correoElectronico;
    int codigoDePerfil;
    public Usuario(String nombre, String correoElectronico){
        this.nombre=nombre;
        this.correoElectronico=correoElectronico;
        this.codigoDePerfil=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCodigoDePerfil() {
        return codigoDePerfil;
    }

    public void setCodigoDePerfil(int codigoDePerfil) {
        this.codigoDePerfil = codigoDePerfil;
    }

    void mostrarUsuario(){
        System.out.println("Soy un usuario llamado "+getNombre()+" y mi correo electronico es "+getCorreoElectronico());
    }
}
