package com.ncjoshi.scmebrewery.services;

import com.ncjoshi.scmebrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ncj on 08 Oct, 2020.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Schonbuch")
                .beerStyle("Pils")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // Todo updating existing Beer resource
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer...");
    }
}
