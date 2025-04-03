package com.example;

import java.sql.SQLException;

public class App {
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );


        DBConnection.Conect();
    }
}
