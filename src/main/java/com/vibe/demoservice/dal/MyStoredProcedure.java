package com.vibe.demoservice.dal;

import oracle.jdbc.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

@Component
public class MyStoredProcedure extends StoredProcedure {

    @Autowired
    public MyStoredProcedure(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate, "procOneOUTParameter");
        declareParameter(new SqlOutParameter("out", OracleTypes.VARCHAR));
        compile();
    }
}
