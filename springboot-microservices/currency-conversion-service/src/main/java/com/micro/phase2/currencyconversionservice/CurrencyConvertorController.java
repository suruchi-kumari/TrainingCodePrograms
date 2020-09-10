package com.micro.phase2.currencyconversionservice;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConvertorController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CurrencyExchangeServiceProxy exchangeProxy;
	
	@GetMapping("/currency-convertor-service/from/{from}/to/{to}/quantity/{quantity}")
	public ConvertorBean convertCurrency(@PathVariable String from,
			@PathVariable String to, @PathVariable Long quantity) {
		
		 //Feign Problem 1
		  Map<String, String> uriVariables = new HashMap<>();
		  uriVariables.put("from",from); 
		  uriVariables.put("to",to);
		  
		  ResponseEntity<ConvertorBean> respEntity = new RestTemplate().getForEntity(
		  "http://localhost:1101/currency-exchange/from/{from}/to/{to}",
		  ConvertorBean.class, uriVariables); 
		  
		  ConvertorBean response =  respEntity.getBody();
		  
		  ConvertorBean cbean = new ConvertorBean(response.getId(), from, to,
		  response.getConversionMultiple(),quantity,
		  (quantity*(response.getConversionMultiple())),
		  response.getPort());
		  
		  return cbean;
		 
		//return new ConvertorBean(1001,from,to,10,12,120,0);
			
	}
	
	@GetMapping("/currency-convertor-feign/from/{from}/to/{to}/quantity/{quantity}")
	public ConvertorBean convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to, @PathVariable Long quantity) {
		
		  ConvertorBean response =  exchangeProxy.exchangeCurrency(from, to);
		  
		  ConvertorBean cbean = new ConvertorBean(response.getId(), from, to,
		  response.getConversionMultiple(),quantity,
		  (quantity*(response.getConversionMultiple())),
		  response.getPort());
		  log.info("convertor controller response is : {}",response);
		  return cbean;
		 
		//return new ConvertorBean(1001,from,to,10,12,120,0);
			
	}

}
