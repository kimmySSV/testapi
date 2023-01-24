package com.ldb.testapi.RowMapper;

import com.ldb.testapi.Model.Card;
import com.ldb.testapi.Model.Test;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMapper  implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
         Test data = new Test();

        Card card = new Card();

        try {
            data.setAtmId(rs.getString("ATM"));
            data.setLocation(rs.getString("ATM_LOCATION"));

        }catch (Exception e){
            e.printStackTrace();
            return data;
        }
        return data;
    }
}
