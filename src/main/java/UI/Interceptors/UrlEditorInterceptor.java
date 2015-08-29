package UI.Interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Martin Alejandro on 29/08/2015.
 */
public class UrlEditorInterceptor  extends AbstractInterceptor {

    @Override
    public String intercept(final ActionInvocation actionInvocation) throws Exception {

        Map session = actionInvocation.getInvocationContext().getSession();
        HttpServletRequest request = ServletActionContext.getRequest();
        String spath = request.getServletPath();
        try {
            spath = StringUtils.remove(spath, "/");
            spath = StringUtils.remove(spath, ".jsp");
            spath = StringUtils.remove(spath, ".action");
            spath.toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(spath);
        return  actionInvocation.invoke();
    }
}
