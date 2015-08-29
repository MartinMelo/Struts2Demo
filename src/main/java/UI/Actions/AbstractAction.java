package UI.Actions;

import Model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * User: Martin Alejandro Melo
 * Date: 28/08/15
 * Time: 14:38
 */
public abstract class AbstractAction extends ActionSupport implements SessionAware {
    //Variables
    private User userLoged;

    //Metodos
    /**
     * Retorna el parametro del request
     *
     * @param parametro
     * @return
     */
    public String getParameterDelRequest(String parametro) {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        return request.getParameter(parametro);
    }

    //Getters & Setters
    /**
     * Devuelve la session que tiene el action context.
     * @return Map
     */
    public Map getSession() {
        return ActionContext.getContext().getSession();
    }

    /**
     * Settea la session de tod o el runtime
     *
     * @param session
     */
    public void setSession(Map session) {
        ActionContext.getContext().setSession(session);
    }
}
