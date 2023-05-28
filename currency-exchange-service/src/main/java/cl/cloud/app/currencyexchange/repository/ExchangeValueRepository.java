package cl.cloud.app.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.cloud.app.currencyexchange.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
