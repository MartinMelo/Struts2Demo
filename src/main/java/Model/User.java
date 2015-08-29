package Model;


/**
 * Created by Martin Alejandro on 28/08/2015.
 */
public class User {

    private Long id;
    private String userName;
    private String password;


    //GETTERS && SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
