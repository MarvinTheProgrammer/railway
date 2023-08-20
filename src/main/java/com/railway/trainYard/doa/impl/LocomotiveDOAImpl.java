package com.railway.trainYard.doa.impl;

import com.railway.trainYard.doa.LocomotiveDOA;
import com.railway.trainYard.domainModel.Locomotive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Consumer;

@Repository
public class LocomotiveDOAImpl implements LocomotiveDOA {

    private final JdbcTemplate jdbcTemplate;
    private final String getLocomotives = "SELECT id, locomotive_uuid, type_id, company_id, name FROM locomotive";

    @Autowired
    public LocomotiveDOAImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void getLocomotive(Consumer<Locomotive> locomotiveConsumer) {
        PreparedStatementCreator psc = con -> con.prepareStatement(getLocomotives);

        jdbcTemplate.query(psc, rs -> {
            locomotiveConsumer.accept(getLocomotiveRowCallbackHandler(rs));
        });
    }

    private Locomotive getLocomotiveRowCallbackHandler(ResultSet resultSet){
        try{
            return new Locomotive(
                    resultSet.getLong("id"),
                    resultSet.getObject("locomotive_uuid", java.util.UUID.class),
                    resultSet.getInt("type_id"),
                    resultSet.getInt("company_id"),
                    resultSet.getString("name")
            );
        } catch (SQLException ex) {
            System.out.println("Could not retrieve locomotive data. Error code: " + ex.getErrorCode() + ". SQL state code: " + ex.getSQLState());
        }
        return null;
    }
}
