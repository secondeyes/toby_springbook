package main.java;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public class DaoFactory {

    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());

    }

    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

}
