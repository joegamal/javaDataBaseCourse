package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/example"; 
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";

    public static void Conect() throws SQLException {
        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)){

             

            System.out.println("Connected to PostgreSQL successfully!");


            con.close();
        }catch(SQLClientInfoException exp){

        }
    }

}

