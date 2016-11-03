import main.java.NUserDao;
import main.java.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        NUserDao userDao = new NUserDao();

        User user = new User();
        user.setId("123ww333");
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
