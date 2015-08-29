package Services;

import Model.User;
import Persistencia.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Martin Alejandro Melo
 * on 29/08/2015.
 */
@Component
public class RegistrationService {

    @Autowired
    private UserDAO userDAO;

    public RegistrationService() {
        System.out.println("RegistrationService Initialized");
    }

    public void registrarUsuario(User user) {
        this.userDAO.save(user);
    }

    //GETTERS && SETTERS
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
