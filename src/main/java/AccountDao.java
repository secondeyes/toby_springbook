package main.java;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public class AccountDao {

    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {

        this.connectionMaker = connectionMaker;
    }
}
