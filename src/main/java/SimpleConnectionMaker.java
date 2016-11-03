package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by yongjunjung on 2016. 11. 3..
 */
public class SimpleConnectionMaker {

    public Connection makerNewConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/springbook", "sa", "");
    }
}
