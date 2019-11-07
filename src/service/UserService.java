package service;

import dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: MuChengxue
 * @Date: 2019/11/3 1:04
 * @Description: service
 * @version: 1.0
 */
@Transactional
public class UserService {
    //注入dao对象
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        //    UserDao userDao = new UserDaoImpl();
        // 本来应该这样创建对象，所以我们应该创建一个 UserDao的对象，但是在配置文件中注入的应该是一个 UserDaoImpl的对象
        userDao.test();
    }
}
