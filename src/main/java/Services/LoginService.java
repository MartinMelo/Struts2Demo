package Services;

import Model.User;
import Persistencia.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Martin Alejandro Melo on 28/08/2015.
 */
public class LoginService {

    @Autowired
    private UserDAO userDAO;

    public User loguearUsuario(){
        return null;
    }

    //GETTERS && SETTERS
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
