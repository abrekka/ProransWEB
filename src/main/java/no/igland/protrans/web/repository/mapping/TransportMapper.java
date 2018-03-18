package no.igland.protrans.web.repository.mapping;

import no.igland.protrans.web.domene.Transport;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransportMapper implements RowMapper<Transport> {
    @Override
    public Transport mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Transport().id(resultSet.getInt("ID"))
                .transportinfo(resultSet.getString("TRANSPORTINFO"))
                .aar(resultSet.getInt("aar")).uke(resultSet.getInt("uke"))
                .firma(resultSet.getString("firma")).sjaafoer(resultSet.getString("sjaafoer"))
                .ordrenr(resultSet.getString("ordrenr")).kunde(resultSet.getString("kunde"))
                .adresse(resultSet.getString("adresse"))
                .transportType(resultSet.getString("transport_type"));
    }
}
