package action;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

/**
 * @Auther: MuChengxue
 * @Date: 2019/11/3 1:04
 * @Description: action
 * @version: 1.0
 */
public class UserAction extends ActionSupport {
    private UserService UserService;

    public void setUserService(UserService userService) {
        UserService = userService;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("I'm in UserAction !!!!!");
        UserService.test();
        return NONE;
    }
}
