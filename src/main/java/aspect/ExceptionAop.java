package aspect;

import domain.Admin;
import domain.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

/**
 * @Description: 出现异常将异常数据，可以扩展邮箱异常通知
 * @author: Arnold
 * @since: 2019/4/21 20:53
 * @version: v1.0.0
 */
@Aspect
@Component
public class ExceptionAop {
    public final static String LOGGER_PATH = "C:/driving_exception_log.text";

    @Pointcut("execution(* *.*(..))")
    public void pointcut() {
    }

    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void exception(JoinPoint point, Exception e) {
        StringBuilder sb = new StringBuilder();
        //1.获取用户信息， 记录当前时间， 记录异常信息
        HttpServletRequest requestAttributes = (HttpServletRequest) RequestContextHolder.getRequestAttributes();
        Map<String, Object> map = (Map<String, Object>) requestAttributes.getSession().getAttribute("token");
        map.forEach((key, value) -> {
            if (key.equals("student"))
                sb.append("<").append(((Student) value).getStu_name()).append("> 学员在： ");
            else
                sb.append("<").append(((Admin) value).getAdmin_name()).append("> 管理员在： ");
        });
        sb.append(new Date(System.currentTimeMillis()).toString()).append("时间,执行：").append(point.getSignature().getName()).
                append("方法时发生异常，异常类型是：").append(e.toString()).append("/n");


        //2.写到日志中
        try {
            FileChannel outChannel = new FileOutputStream(new File(LOGGER_PATH)).getChannel();
            ByteBuffer byteBuffer = Charset.forName("utf-8").encode(sb.toString());
            outChannel.write(byteBuffer);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //todo 3.邮箱通知管理管理员，待续。。。。。。。。。。。。。。。。。。

    }
}
