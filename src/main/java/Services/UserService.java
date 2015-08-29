package Services;

import Model.User;
import Persistencia.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Martin Alejandro on 29/08/2015.
 */
@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserService() {
        System.out.println("ola k ase");
    }

    //@Transactional
    public User loadUser(Long id){
        return userDAO.load(id);
    }

    //GETTERS && SETTERS
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
