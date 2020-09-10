package com.moicro.phase2.currencyexchange.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository rep;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchangeCurrency(@PathVariable("from") String from,
			@PathVariable("to") String to) {
		ExchangeValue exchangeValue = rep.findByFromAndTo(from, to);
		//new ExchangeValue(1001, from, to, 65);\
		
				exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
			log.info("from currency exchange controller {}", exchangeValue);
		return exchangeValue;
		
	}
	
}
