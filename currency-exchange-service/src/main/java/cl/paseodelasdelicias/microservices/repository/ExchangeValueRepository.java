package cl.paseodelasdelicias.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.paseodelasdelicias.microservices.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
