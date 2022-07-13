package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

//Estudar "Dependência de componente para outros"
@Service
public class SaleService {
	
	private final int ONE_YEAR_IN_DAYS = 365;

	@Autowired
	private SaleRepository repository;
//	
//	twt _ohs978STzeHkUfuXXeiMpdB8VUrpUmEcQY-L1N3
	
	/*
	 * @anotação => assistir video de Nelio sobre JPA no youtube Acrescentar
	 * pageable => digamos que pageia os resultados em paginas de 20 em 20
	 */
	public Page<Sale> findSales(Pageable pageable, String minDate, String maxDate) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

		LocalDate min = minDate.equals("") ? today.minusDays(ONE_YEAR_IN_DAYS) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		return repository.findSales(min, max, pageable);
	}
}
