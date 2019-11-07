package dao.impl;

import dao.UserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import pojo.User;

import java.util.List;

/**
 * @Auther: MuChengxue
 * @Date: 2019/11/3 1:06
 * @Description: dao.impl
 * @version: 1.0
 */
public class UserDaoImpl implements UserDao {

    // 得到 hibernateTemplate 对象
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void add() {
        // HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        // 调用 save 方法完成添加
        User user = new User();
        user.setId(4);
        user.setName("Ke");
        user.setSalary(8888);
        hibernateTemplate.save(user);
    }

    //根据ID得到对象
    public void get() {
        User user = hibernateTemplate.get(User.class, 1);
        System.out.println(user.getName());
    }

    public void find() {
        List<User> list = (List<User>) hibernateTemplate.find("from User");
        for (User user : list) {
            System.out.println(user.getName());
        }
    }

    public void find2() {
        List<User> list = (List<User>) hibernateTemplate.find("from User where name=?0","Uzi");
        for (User user : list) {
            System.out.println(user.getName());
        }
    }


    @Override
    public void test() {
//        add();
//        get();
        find();
    }
}
