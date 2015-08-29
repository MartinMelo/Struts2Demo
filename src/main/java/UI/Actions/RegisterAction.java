package UI.Actions;

import Model.User;
import Services.LoginService;
import Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.imageio.spi.RegisterableService;

/**
 * Created by Martin Alejandro on 28/08/2015.
 */
public class RegisterAction extends AbstractAction{

    private String userName;
    private String password;
    //Servicios
    @Autowired
    private RegistrationService registrationService;


    /**
     * Registra el usuario y lo guarda en la db.
     * @return String
     */
    public String registrar(){
        User user = new User();
        user.setUserName(this.userName);
        user.setPassword(this.password);
        this.registrationService.registrarUsuario(user);
        return SUCCESS;
    }


    //GETTERS && SETTERS
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
}
