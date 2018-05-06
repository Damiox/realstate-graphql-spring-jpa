package com.github.damiox.realstate.dao;

import com.github.damiox.realstate.entity.Neighbourhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA Repository for {@link Neighbourhood} entity
 *
 * @author dnardelli
 */
@Repository
public interface NeighbourhoodRepository extends JpaRepository<Neighbourhood, Long> {

}
