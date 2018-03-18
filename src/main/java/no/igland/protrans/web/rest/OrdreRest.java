package no.igland.protrans.web.rest;

import no.igland.protrans.web.domene.Ordre;
import no.igland.protrans.web.domene.Transport;
import no.igland.protrans.web.domene.Veggproduksjon;
import no.igland.protrans.web.repository.Protransrepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrdreRest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrdreRest.class);
    @Autowired
    private Protransrepository protransrepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/veggproduksjon/{ordrenr}/sett_produsert", method = RequestMethod.POST)
    public Veggproduksjon settProdusert(@PathVariable String ordrenr) {
        LOGGER.info("Sett produsert {}", ordrenr);
        return protransrepository.settProdusertVeggproduksjon(ordrenr);
    }

    @RequestMapping("/ordre")
    public List<Ordre> finnOrdre() {
        return protransrepository.finnOrdre();
    }

    @RequestMapping("/veggproduksjon")
    public List<Veggproduksjon> finnVeggproduksjon() {
        return protransrepository.finnVeggproduksjon();
    }

    @RequestMapping("/transport")
    public List<Transport> finnTransport(@RequestParam("aar") Integer aar, @RequestParam("uke") Integer uke) {
        return protransrepository.finnTransport(aar, uke);
    }
}
