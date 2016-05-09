package net.cserny.objectpool;

import java.sql.Connection;

/**
 * Created by user on 09.05.2016.
 */
public class ObjectPoolApp
{
    public static void main(String[] args)
    {
        JdbcConnectionPool connectionPool = new JdbcConnectionPool(
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "leo", "secret"
        );
        Connection connection = connectionPool.checkOut();

        // use the connection

        connectionPool.checkIn(connection);
    }
}
