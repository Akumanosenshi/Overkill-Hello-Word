package org.alison;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model implements IModel {

    @Override
    public String getHello() {
        String result = null;
        try {
            DBConnection.INSTANCE.connect();
            Connection connection = DBConnection.INSTANCE.getConnection();
            CallableStatement call = connection.prepareCall("SELECT * FROM hello");
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (!resultSet.next()) {
                return null;
            } else {
                result = resultSet.getString("messages");
            }
            DBConnection.INSTANCE.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public String getHello(int id) {
        String result = null;
        try {
            DBConnection.INSTANCE.connect();
            Connection connection = DBConnection.INSTANCE.getConnection();
            CallableStatement call = connection.prepareCall("SELECT * FROM hello WHERE ID = " + id);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (!resultSet.next()) {
                return null;
            } else {
                result = resultSet.getString("messages");
            }
            DBConnection.INSTANCE.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
