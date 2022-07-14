package cl.paseodelasdelicias.microservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.paseodelasdelicias.microservices.model.ExchangeValue;
import cl.paseodelasdelicias.microservices.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retirebeExchangeValue(@PathVariable String from, @PathVariable String to ) {
		
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(port);
		
		return exchangeValue;
	}
}
