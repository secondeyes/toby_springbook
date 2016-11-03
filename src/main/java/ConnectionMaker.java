package main.java;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public interface ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException;

}
