package no.igland.protrans.web.domene;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

public class Veggproduksjon {
    private String ordrenr;
    private String kundedetaljer;
    private String transportdetaljer;
    private String adresse;
    private Integer produksjonsuke;
    private String opplastingsdato;
    private String produksjonsdato;
    private String startetTidspunkt;
    private BigDecimal tidsforbruk;
    private String gjortAv;

    public String getGjortAv() {
        return gjortAv;
    }

    public BigDecimal getTidsforbruk() {
        return tidsforbruk;
    }

    public String getStartetTidspunkt() {
        return startetTidspunkt;
    }

    public String getProduksjonsdato() {
        return produksjonsdato;
    }

    public String getOpplastingsdato() {
        return opplastingsdato;
    }

    public Integer getProduksjonsuke() {
        return produksjonsuke;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getOrdrenr() {
        return ordrenr;
    }

    public String getKundedetaljer() {
        return kundedetaljer;
    }

    public String getTransportdetaljer() {
        return transportdetaljer;
    }

    public Veggproduksjon medOrdrenr(String ordrenr) {
        this.ordrenr = ordrenr;
        return this;
    }

    public Veggproduksjon medKundedetaljer(String kunde) {
        this.kundedetaljer = kunde;
        return this;
    }

    public Veggproduksjon medTransportdetaljer(String transportdetaljer) {
        this.transportdetaljer = transportdetaljer;
        return this;
    }

    public Veggproduksjon medAdresse(String addresse) {
        this.adresse = addresse;
        return this;
    }

    public Veggproduksjon medProduksjonsuke(Integer produksjonsuke) {
        this.produksjonsuke = produksjonsuke;
        return this;
    }

    public Veggproduksjon medOpplastingsdato(Date opplastingsdato) {
        this.opplastingsdato = opplastingsdato == null
                ? null
                : opplastingsdato.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        return this;
    }

    public Veggproduksjon medProduksjonsdato(Date produksjonsdato) {
        this.produksjonsdato = produksjonsdato == null
                ? null
                : produksjonsdato.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        return this;
    }

    public Veggproduksjon medStartetTidspunkt(Timestamp startet) {
        this.startetTidspunkt = startet == null
                ? null
                : startet.toLocalDateTime().format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"));
        return this;
    }

    public Veggproduksjon medTidsforbruk(BigDecimal tidsforbruk) {
        this.tidsforbruk = tidsforbruk;
        return this;
    }

    public Veggproduksjon medGjortAv(String gjortAv) {
        this.gjortAv = gjortAv;
        return this;
    }
}
