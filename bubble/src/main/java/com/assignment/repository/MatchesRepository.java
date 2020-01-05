package com.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.domain.Matches;


@Repository
public interface MatchesRepository extends CrudRepository<Matches, Integer> {

}
