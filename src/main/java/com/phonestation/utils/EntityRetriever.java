package com.phonestation.utils;

import com.phonestation.model.entities.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EntityRetriever {
    public static Account retrieveAccount(ResultSet resultSet) throws SQLException {
        return Account.builder()
                .id(resultSet.getInt("id"))
                .login(resultSet.getString("login"))
                .password(resultSet.getString("password"))
                .role(Role.valueOf(resultSet.getString("role")))
                .build();
    }

    public static Bill retrieveBill(ResultSet resultSet) throws SQLException {
        return Bill.builder()
                .id(resultSet.getInt("id"))
                .userId(resultSet.getInt("user_id"))
                .date(resultSet.getDate("date"))
                .desription(resultSet.getString("description"))
                .price(resultSet.getInt("price"))
                .build();
    }

    public static Services retrieveServices(ResultSet resultSet) throws SQLException {
        return Services.builder()
                .id(resultSet.getInt("id"))
                .name(resultSet.getString("name"))
                .duration(resultSet.getInt("duration"))
                .price(resultSet.getInt("price"))
                .build();
    }

    public static User retrieveUser(ResultSet resultSet) throws SQLException {
        return User.builder()
                .id(resultSet.getInt("id"))
                .accountId(resultSet.getInt("account_id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .phoneNumber(resultSet.getString("phone_number"))
                .balance(resultSet.getInt("balance"))
                .isConnected(resultSet.getBoolean("is_connected"))
                .isBlocked(resultSet.getBoolean("is_blocked"))
                .build();
    }
}
