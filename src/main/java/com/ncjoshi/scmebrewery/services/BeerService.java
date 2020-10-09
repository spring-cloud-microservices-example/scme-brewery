package com.ncjoshi.scmebrewery.services;

import com.ncjoshi.scmebrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by ncj on 08 Oct, 2020.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
