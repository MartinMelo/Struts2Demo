package Persistencia.DAO;

import Model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Martin Alejandro on 29/08/2015.
 */
@Component
public class UserDAO{

    Map<Long, User> users;

    public UserDAO() {
        this.users = new HashMap<Long, User>();
    }

    public User load(Long id) {
        return this.users.get(id);
    }
    public void save(User user) {
        this.users.put(user.getId(), user);
    }

}
