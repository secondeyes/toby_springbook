package main.java;

import java.sql.SQLException;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao userDao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("1231wws333");
        user.setName("jjun");
        user.setPassword("sss");

        userDao.add(user);

        System.out.println(user.getId() + "등록 성공!!");

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");

    }
}
