package com.github.damiox.realstate.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.damiox.realstate.dao.HouseRepository;
import com.github.damiox.realstate.dao.NeighbourhoodRepository;
import com.github.damiox.realstate.entity.House;
import com.github.damiox.realstate.entity.Neighbourhood;
import org.springframework.stereotype.Component;

/**
 * GraphQL Query class.
 * All query methods defined in .graphqls are implemented here.
 *
 * @author dnardelli
 */
@Component
public class Query implements GraphQLQueryResolver {

    private final NeighbourhoodRepository neighbourhoodRepository;
    private final HouseRepository houseRepository;

    public Query(NeighbourhoodRepository neighbourhoodRepository, HouseRepository houseRepository) {
        this.neighbourhoodRepository = neighbourhoodRepository;
        this.houseRepository = houseRepository;
    }

    public Iterable<Neighbourhood> findAllNeighbourhoods() {
        return neighbourhoodRepository.findAll();
    }

    public Iterable<House> findAllHouses() {
        return houseRepository.findAll();
    }

    public long countNeighbourhoods() {
        return neighbourhoodRepository.count();
    }

    public long countHouses() {
        return houseRepository.count();
    }

}
