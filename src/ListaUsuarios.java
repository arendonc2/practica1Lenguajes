import java.util.ArrayList;
import java.util.List;
public class ListaUsuarios {
    static List<List<Usuario>> listaUsuarios;
    public ListaUsuarios(){
        listaUsuarios=new ArrayList<>();
    }
    void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    Usuario buscarUsuarioPorCorreo(String correo){
        for(Usuario usuario : listaUsuarios){
            if(correo.equals(usuario.getCorreoElectronico())){
                return usuario;
            }
        }
        return null ;
    }
}
