package UI.Actions;

import Model.User;
import Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Martin Alejandro on 28/08/2015.
 */
public class LoginAction extends AbstractAction{

    private String userName;
    private String password;
    //Servicios
    @Autowired
    private LoginService loginService;

    public String login(){
        return SUCCESS;
    }
    public String registrarSesion(){
        User user = this.loginService.loguearUsuario();
        //meterlo en la session
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
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
