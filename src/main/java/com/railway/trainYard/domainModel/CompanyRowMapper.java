package com.railway.trainYard.domainModel;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRowMapper implements RowMapper {

    @Override
    public Company mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Company(
            resultSet.getInt("id"),
            resultSet.getString("name")
        );
    }
}
