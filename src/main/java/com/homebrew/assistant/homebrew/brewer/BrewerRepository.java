package com.homebrew.assistant.homebrew.brewer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface BrewerRepository extends JpaRepository<Brewer, Integer> {

    /**
     * Retrieve {@link Brewer}s from the data store by user name, returning all brewers
     * whose user name <i>starts</i> with the given name.
     * @param userName Value to search for
     * @return a Collection of matching {@link Brewer}s (or an empty Collection if none
     * found)
     */
    /*@Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
    @Transactional(readOnly = true)
    Collection<Brewer> findByUserName(@Param("userName") String userName);*/
}
