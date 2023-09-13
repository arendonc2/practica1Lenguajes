import java.util.Scanner;
public class Menu {
    Scanner tec = new Scanner(System.in);
    int cantUsuarios;
    public Menu(){
        System.out.println("¿Cuantos usuarios desea ingresar?");
        this.cantUsuarios =tec.nextInt();
    }

    public int getCantUsuarios() {
        return cantUsuarios;
    }

    public void setCantUsuarios(int cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }
    Cliente crearCliente(){
        System.out.println("Ingrese el nombre del cliente");
        String nombreC = tec.next();
        System.out.println("Ingrese el correo electronico del cliente");
        String correoE = tec.next();
        System.out.println("¿Desea ingresar telefono y dirección?");
        String deseo  = tec.next();
        deseo=deseo.toUpperCase();
        if(deseo.equals("SI")){
            System.out.println("Ingrese el telefono");
            int telefono = tec.nextInt();
            System.out.println("Ingrese la direccion");
            String direccion = tec.next();
            Cliente Cliente1 = new Cliente(nombreC,correoE,telefono,direccion);
            return Cliente1;
        }
        Cliente Cliente1 = new Cliente(nombreC,correoE);
        return Cliente1;
    }
    Cajero crearCajero(){
        System.out.println("Ingrese el nombre del cajero");
        String nombreC = tec.next();
        System.out.println("Ingrese el correo electronico del cajero");
        String correoE = tec.next();
        System.out.println("Ingrese la clave de cajero");
        String claveCajero  = tec.next();
        Cajero Cajero1 = new Cajero(nombreC,correoE,claveCajero);
        return Cajero1;
    }
    Admin crearAdmin(){
        System.out.println("Ingrese el nombre del Admin");
        String nombreA = tec.next();
        System.out.println("Ingrese el correo electronico del admin");
        String correoA = tec.next();
        System.out.println("Ingrese la clave de admin");
        String claveA  = tec.next();
        Admin Admin1 = new Admin(nombreA,correoA,claveA);
        return Admin1;
    }
    void menuPrincipal(){

        int i=0;
        while (i<this.cantUsuarios){
            System.out.println("¿Qué tipo de usuario desea ingresar?");
            System.out.println("1 - Cliente");
            System.out.println("2 - Cajero");
            System.out.println("3 - Admin");
            int tipo = tec.nextInt();
            if(tipo==1){
                Cliente clienteX =crearCliente();
                clienteX.mostrarContenido();
                clienteX.consultarProducto();
            } else if (tipo==2) {
                Cajero cajeroX =crearCajero();
                cajeroX.mostrarContenido();
                cajeroX.registarVenta();
            } else if (tipo==3) {
                Admin adminX = crearAdmin();
                adminX.mostrarContenido();
                adminX.asignarCodigoPerfil();
            }
            i++;
        }
    }
}
