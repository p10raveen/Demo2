package org.example;

import org.example.dbconnect.DbConnection;

public class Main {
    public static void main(String[] args) {

            if(DbConnection.takeConnection()!=null)
                System.out.println("Hello world!");
            else
                System.out.println("Hi world!");


    }
}