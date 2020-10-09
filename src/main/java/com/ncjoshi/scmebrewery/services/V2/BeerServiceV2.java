package com.ncjoshi.scmebrewery.services.V2;

import com.ncjoshi.scmebrewery.web.model.V2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by ncj on 09 Oct, 2020.
 */
public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
