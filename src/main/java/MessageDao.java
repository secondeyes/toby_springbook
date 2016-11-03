package main.java;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public class MessageDao {

    private ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
