package Persistencia.DAO;

import Model.User;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

/**
 * Created by Martin Alejandro on 29/08/2015.
 */
@Component
public class UserDAO{

    public UserDAO() {
        System.out.println("Trabajando o k ase");
    }

    public User load(Long id) {
        return new User();
    }
}
