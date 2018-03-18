package no.igland.protrans.web.repository.mapping;

import no.igland.protrans.web.domene.Ordre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdreMapper implements RowMapper<Ordre> {
    @Override
    public Ordre mapRow(ResultSet resultSet, int i) throws SQLException {
        Ordre ordre=new Ordre();
        ordre.setOrdreNr(resultSet.getString("order_nr"));
        return ordre;
    }
}
