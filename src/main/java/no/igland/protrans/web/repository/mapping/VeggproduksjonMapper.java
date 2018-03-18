package no.igland.protrans.web.repository.mapping;

import no.igland.protrans.web.domene.Veggproduksjon;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VeggproduksjonMapper implements RowMapper<Veggproduksjon> {
    @Override
    public Veggproduksjon mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Veggproduksjon().medOrdrenr(resultSet.getString("order_nr"))
                .medKundedetaljer(resultSet.getString("customer_details"))
                .medTransportdetaljer(resultSet.getString("transport_details"))
                .medAdresse(resultSet.getString("address"))
                .medProduksjonsuke(resultSet.getInt("production_week"))
                .medOpplastingsdato(resultSet.getDate("loading_date"))
                .medProduksjonsdato(resultSet.getDate("produced"))
                .medStartetTidspunkt(resultSet.getTimestamp("action_started"))
                .medTidsforbruk(resultSet.getBigDecimal("real_production_hours"))
                .medGjortAv(resultSet.getString("done_by"));
    }
}
