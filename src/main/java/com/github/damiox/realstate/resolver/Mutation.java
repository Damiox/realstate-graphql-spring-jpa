package com.github.damiox.realstate.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.damiox.realstate.dao.HouseRepository;
import com.github.damiox.realstate.dao.NeighbourhoodRepository;
import com.github.damiox.realstate.entity.House;
import com.github.damiox.realstate.entity.Neighbourhood;
import com.github.damiox.realstate.exception.HouseNotFoundException;
import com.github.damiox.realstate.exception.NeighbourhoodNotFoundException;
import org.springframework.stereotype.Component;

/**
 * GraphQL Mutation class.
 * All mutation methods defined in .graphqls are implemented here.
 *
 * @author dnardelli
 */
@Component
public class Mutation implements GraphQLMutationResolver {

    private final NeighbourhoodRepository neighbourhoodRepository;
    private final HouseRepository houseRepository;

    public Mutation(NeighbourhoodRepository neighbourhoodRepository, HouseRepository houseRepository) {
        this.neighbourhoodRepository = neighbourhoodRepository;
        this.houseRepository = houseRepository;
    }

    public Neighbourhood newNeighbourhood(String name, String city) {
        var neighbour = new Neighbourhood();
        neighbour.setName(name);
        neighbour.setCity(city);

        neighbourhoodRepository.save(neighbour);

        return neighbour;
    }

    public House newHouse(Integer beds, Integer baths, Integer squareFeet, Integer age, Long neighbourhoodId) {
        var neighbourhood = neighbourhoodRepository.findById(neighbourhoodId)
            .orElseThrow(() -> new NeighbourhoodNotFoundException("The neighbourhood to be associated was not found", neighbourhoodId));

        var house = new House();
        house.setBeds(beds);
        house.setBaths(baths);
        house.setSquareFeet(squareFeet);
        house.setAge(age);
        house.setNeighbourhood(neighbourhood);
        houseRepository.save(house);

        return house;
    }

    public boolean deleteHouse(Long id) {
        houseRepository.deleteById(id);
        return true;
    }

    public House updateHouseAge(Long id, Integer age) {
        var house = houseRepository.findById(id)
            .orElseThrow(() -> new HouseNotFoundException("The house to be updated was not found", id));

        house.setAge(age);

        houseRepository.save(house);

        return house;
    }

}
