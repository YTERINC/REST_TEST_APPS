package ru.yterinc.RestApp1.PeopleRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yterinc.RestApp1.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
