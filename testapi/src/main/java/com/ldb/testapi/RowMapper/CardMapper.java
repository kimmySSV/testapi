package com.ldb.testapi.RowMapper;

import com.ldb.testapi.Model.Card;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardMapper  implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Card data = new Card();

        try {
            data.setCardNo(rs.getString("CARD_NO"));
            data.setCustomerId(rs.getInt("CARD_CUST_ID"));
            data.setCardName(rs.getString("CARD_EMBOSSED_NAME"));

        }catch (Exception e){
            e.printStackTrace();
            return data;
        }
        return data;
    }
}
