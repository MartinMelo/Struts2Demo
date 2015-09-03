package UI.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyno on 03/09/2015.
 */
public class UserAction extends AbstractAction {

    private List<String> nombres = new ArrayList<String>();

    public String listaDeUsuarios(){
        for(int i=0; i<10; i++){
            nombres.add("Nombre"+i);
        }
        return SUCCESS;
    }

    public List<String> getNombres() {
        return nombres;
    }
}
