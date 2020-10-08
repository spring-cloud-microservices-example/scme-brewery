package com.ncjoshi.scmebrewery.services;

import com.ncjoshi.scmebrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ncj on 08 Oct, 2020.
 */
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
}
