package com.ncjoshi.scmebrewery.web.mappers;

import com.ncjoshi.scmebrewery.domain.Beer;
import com.ncjoshi.scmebrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by ncj on 11 Oct, 2020.
 */
@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
