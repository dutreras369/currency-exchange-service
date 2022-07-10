package cl.paseodelasdelicias.microservices.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.paseodelasdelicias.microservices.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {
		
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retirebeExchangeValue(@PathVariable String from, @PathVariable String to ) {
		return new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
	}
}
