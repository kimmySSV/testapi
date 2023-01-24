package com.ldb.testapi.RowMapper;

import com.ldb.testapi.Model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Customer data = new Customer();

        try {
            data.setCustID(rs.getString("CUSTOMER_ID"));
            data.setCustName(rs.getString("NAME"));
            data.setCustAddress(rs.getString("ADDRESS"));
            data.setCustWedsite(rs.getString("WEBSITE"));
            data.setCustCreditLimit(rs.getInt("CREDIT_LIMIT"));

        }catch (Exception e){
            e.printStackTrace();
            return data;
        }
        return data;
    }

}
