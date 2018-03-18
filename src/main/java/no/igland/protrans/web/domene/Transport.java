package no.igland.protrans.web.domene;

public class Transport {
    private Integer id;
    private String transportinfo;
    private Integer aar;
    private Integer uke;
    private String firma;
    private String sjaafoer;
    private String ordrenr;
    private String kunde;
    private String adresse;
    private String transportType;

    public String getTransportType() {
        return transportType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAar() {
        return aar;
    }

    public String getTransportinfo() {
        return transportinfo;
    }

    public void setTransportinfo(String transportinfo) {
        this.transportinfo = transportinfo;
    }

    public void setAar(Integer aar) {
        this.aar = aar;
    }

    public Integer getUke() {
        return uke;
    }

    public void setUke(Integer uke) {
        this.uke = uke;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getSjaafoer() {
        return sjaafoer;
    }

    public void setSjaafoer(String sjaafoer) {
        this.sjaafoer = sjaafoer;
    }

    public String getOrdrenr() {
        return ordrenr;
    }

    public void setOrdrenr(String ordrenr) {
        this.ordrenr = ordrenr;
    }

    public String getKunde() {
        return kunde;
    }

    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Transport transportinfo(String transportinfo) {
        this.transportinfo=transportinfo;
        return this;
    }

    public Transport aar(Integer aar) {
        this.aar=aar;
        return this;
    }

    public Transport uke(Integer uke) {
        this.uke=uke;
        return this;
    }

    public Transport firma(String firma) {
        this.firma=firma;
        return this;
    }

    public Transport sjaafoer(String sjaafoer) {
        this.sjaafoer=sjaafoer;
        return this;
    }

    public Transport ordrenr(String ordrenr) {
        this.ordrenr=ordrenr;
        return this;
    }

    public Transport kunde(String kunde) {
        this.kunde=kunde;
        return this;
    }

    public Transport adresse(String adresse) {
        this.adresse=adresse;
        return this;
    }

    public Transport id(Integer id) {
        this.id=id;
        return this;
    }

    public Transport transportType(String transportType) {
        this.transportType=transportType;
        return this;
    }
}
