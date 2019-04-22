package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 用户登录鉴权的切面，后续可以加入日志功能
 * @author: Arnold
 * @since: 2019/4/21 18:02
 * @version: v1.0.0
 */
@Aspect
@Component
public class LoginAop {
    @Pointcut("execution(* action.*.*(..))&&!execution(* action.LoginAction.login())")
    public void pointcut() {
    }

    @Around("pointcut()")
    public String around(ProceedingJoinPoint point) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //拦截方法
        Object result = point.proceed();
        if (attributes.getRequest().getSession().getAttribute("token") == null)
            result = "failed";
        return (String) result;
    }
}
