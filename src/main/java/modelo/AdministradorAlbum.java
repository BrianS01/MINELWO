package modelo;

import vo.Album;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class AdministradorAlbum {

    private AdministradorInterprete misInterpretes;
    private Album mialbum;
    private List<Album> listadeAlbunes;
    private static AdministradorAlbum administradorAlbum; 
    
    public AdministradorAlbum(){
        listadeAlbunes=new ArrayList<>();
    }
    
    public boolean ingresarAlbum(int idAlbum, String nombreAlbum, String nombreInterprete){
        for (int i = 0; i < 10; i++) {
            mialbum=new Album(i, nombreAlbum, misInterpretes.getInterpretes().get(i).getNombreInterprete());
            //misInterpretes.getInterpretes().get(i+1).getNombreInterprete()   
        }
        return listadeAlbunes.add(mialbum);
    }
    
    public static AdministradorAlbum getInstance(){
        if(administradorAlbum == null){
            return new AdministradorAlbum();
        }
        return administradorAlbum;
    }
    
    public boolean eliminarAlbum(String nombreAlbum){
        boolean eliminado=false; 
        for (int i = 0; i < listadeAlbunes.size(); i++) {
            if(nombreAlbum.equals(listadeAlbunes.get(i).getNombreAlbum())){
                listadeAlbunes.remove(i).getNombreAlbum();
                eliminado=true;
            }
            else{
                eliminado=false; 
            }
        }
    return eliminado;
    }
    
    public List<Album> getAlbunes(){
        return listadeAlbunes;
    }
    
    public void setAlbunes(List<Album> listadeAlbunes){
        this.listadeAlbunes=listadeAlbunes;
    }
    
}
