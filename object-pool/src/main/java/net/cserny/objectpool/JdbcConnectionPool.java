package net.cserny.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 09.05.2016.
 */
public class JdbcConnectionPool extends ObjectPool<Connection>
{
    private String dsn, usr, pwd;

    public JdbcConnectionPool(String driver, String dsn, String usr, String pwd)
    {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create()
    {
        try {
            return DriverManager.getConnection(dsn, usr, pwd);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void expire(Connection object)
    {
        try {
            ((Connection) object).close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean validate(Connection object)
    {
        try {
            return !((Connection) object).isClosed();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
