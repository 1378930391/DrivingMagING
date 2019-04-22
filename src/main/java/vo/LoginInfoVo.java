package vo;

/**
 * @Description: 登录信息vo
 * @author: Arnold
 * @since: 2019/4/21 16:59
 * @version: v1.0.0
 */
public class LoginInfoVo  {
    private String isStudent;
    private String stu_identity;//管理员也用本字段接收
    private String stu_tel;//管理员密码用本字段接

    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    public String getStu_identity() {
        return stu_identity;
    }

    public void setStu_identity(String stu_identity) {
        this.stu_identity = stu_identity;
    }

    public String getStu_tel() {
        return stu_tel;
    }

    public void setStu_tel(String stu_tel) {
        this.stu_tel = stu_tel;
    }
}
