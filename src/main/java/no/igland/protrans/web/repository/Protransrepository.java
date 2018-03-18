package no.igland.protrans.web.repository;

import no.igland.protrans.web.domene.Ordre;
import no.igland.protrans.web.domene.Transport;
import no.igland.protrans.web.domene.Veggproduksjon;
import no.igland.protrans.web.repository.mapping.OrdreMapper;
import no.igland.protrans.web.repository.mapping.TransportMapper;
import no.igland.protrans.web.repository.mapping.VeggproduksjonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Transactional
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public class Protransrepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Veggproduksjon> finnVeggproduksjon() {
        return jdbcTemplate.query("select * from vegg_production_v " +
                "order by transport_year,transport_week,loading_date,load_time", new VeggproduksjonMapper());
    }

    public List<Ordre> finnOrdre() {
        String sql = "select * from customer_order";
        List<Ordre> ordre = jdbcTemplate.query(sql, new OrdreMapper());
        return ordre;
    }

    public List<Transport> finnTransport(Integer aar, Integer uke) {
        String sql = "select * from transport_v where aar=? and uke=? order by 1";

        return jdbcTemplate.query(
                sql, new Object[]{aar, uke}, new TransportMapper());

    }

    public Veggproduksjon settProdusertVeggproduksjon(String ordrenr) {
        return null;
    }
}
