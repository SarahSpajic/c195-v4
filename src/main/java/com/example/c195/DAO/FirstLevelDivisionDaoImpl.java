package com.example.c195.DAO;

import com.example.c195.model.Country;
import com.example.c195.model.FirstLevelDivision;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FirstLevelDivisionDaoImpl {
    private Connection connection;



    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /** This method retrieves all country names and id's from the database */
    public ObservableList<Country> getAllCountries() throws Exception {
        String query = "SELECT * FROM countries";

        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        ObservableList<Country> countries = FXCollections.observableArrayList();

        while (rs.next()) {
            int countryID = rs.getInt("Country_ID");
            String countryName = rs.getString("Country");

            Country country = new Country(countryID, countryName);
            countries.add(country);
        }

        return countries;
    }

    /** This method checks for the divisions(states) by id*/
    public static FirstLevelDivision getFirstLevelDivisionById(Connection connection, int divisionId) throws SQLException {
        String query = "SELECT * FROM first_level_divisions WHERE Division_ID = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, divisionId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int divisionID = rs.getInt("Division_ID");
            String divisionName = rs.getString("Division");
            int countryId = rs.getInt("Country_ID");
            return new FirstLevelDivision(divisionID, divisionName, countryId);
        }

        return null;
    }


    /** This method checks for the divisions(states) associated with each country id */
    public ObservableList<FirstLevelDivision> getDivisionsByCountryID(int divisionId) throws SQLException {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM first_level_divisions WHERE Country_ID = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, divisionId);
            rs = ps.executeQuery();

            ObservableList<FirstLevelDivision> divisions = FXCollections.observableArrayList();

            while (rs.next()) {
                int divisionID = rs.getInt("Division_ID");
                String divisionName = rs.getString("Division");
                int countryID = rs.getInt("Country_ID");

                FirstLevelDivision division = new FirstLevelDivision(divisionID, divisionName, countryID);
                divisions.add(division);
            }

            return divisions;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }




}
