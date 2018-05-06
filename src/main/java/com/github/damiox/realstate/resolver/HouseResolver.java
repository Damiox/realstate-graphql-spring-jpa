package com.github.damiox.realstate.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.damiox.realstate.dao.NeighbourhoodRepository;
import com.github.damiox.realstate.entity.House;
import com.github.damiox.realstate.entity.Neighbourhood;
import org.springframework.stereotype.Component;

@Component
public class HouseResolver implements GraphQLResolver<House> {

    private final NeighbourhoodRepository neighbourhoodRepository;

    public HouseResolver(NeighbourhoodRepository neighbourhoodRepository) {
        this.neighbourhoodRepository = neighbourhoodRepository;
    }

    public Neighbourhood getNeighbourhood(House house) {
        return neighbourhoodRepository.findById(house.getNeighbourhood().getId()).orElseThrow();
    }

}
