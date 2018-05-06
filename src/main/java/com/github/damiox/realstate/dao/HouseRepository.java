package com.github.damiox.realstate.dao;

import com.github.damiox.realstate.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA Repository for {@link House} entity
 *
 * @author dnardelli
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
