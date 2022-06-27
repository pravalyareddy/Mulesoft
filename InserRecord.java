package com.company;

import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:C:/sqlite/db/MoviesDB.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); 

            String query0 = "INSERT INTO MyMovies values ('Bahubali 2','Prabhas','Anushka', 2017,'S.S.Rajamouli');";
            stmt.executeUpdate(query0); 

            String query1 = "INSERT INTO MyMovies values ('KGF 1','Yash','Srinidhi Shetty', 2018,'Prashanth Neil');";
            stmt.executeUpdate(query1); 

            String query2 = "INSERT INTO MyMovies values ('Shyam singa roy','Nani','Sai Pallavi',2021,'Rahul Sankrityan');";
            stmt.executeUpdate(query2); 

            String query3 = "INSERT INTO MyMovies values ('Ala vaikuntapuramulo','Alluarjun','Pooja Hegde',2020,'Trivikram');";
            stmt.executeUpdate(query3); 

            String query4 = "INSERT INTO MyMovies values ('Shershah','Siddarth Malhotra','Kiara Advani',2021,'Vishnuvardhan');";
            stmt.executeUpdate(query4); 

            String query5 = "INSERT INTO MyMovies values ('RRR','Jr.NTR','Olivia Morris',2022,'S.S.Rajamouli');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();               
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}