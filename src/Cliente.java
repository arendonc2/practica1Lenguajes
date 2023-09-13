public class Cliente extends Usuario{
    int telefono;
    String direccion;
    public Cliente(String nombre, String correoEletronico){
        super(nombre,correoEletronico);
        this.telefono=0;
        this.direccion="0";
    }
    public Cliente(String nombre, String correoElectronico, int telefono, String direccion){
        super(nombre,correoElectronico);
        this.telefono=telefono;
        this.direccion=direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void consultarProducto(){
        System.out.println("¡Consulté un producto!");
    }

    void mostrarContenido(){
        if(this.telefono!=0){
            System.out.println("Soy el cliente "+ getNombre()+" mi correo eletronico es "+getCorreoElectronico()+" mi telefono es "+ getTelefono()+" y mi direccion es "+getDireccion());
        }else{
            mostrarUsuario();
        }
    }
}
