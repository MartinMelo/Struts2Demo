package UI.Interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 * User: Martin Alejandro Melo.
 * Date: 28/08/15
 * Time: 11:10
 */
public class AuthenticationInterceptor extends AbstractInterceptor {



    @Override
    public String intercept(final ActionInvocation actionInvocation) throws Exception {

        Map session = actionInvocation.getInvocationContext().getSession();
        String usuario = (String) session.get("usuario");
        if (usuario == null) {
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }

}
