package com.example.appauthorization.repository

import com.example.appauthorization.jpa.Person
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

@Repository
interface PersonRepository: CrudRepository<Person, Long> {

}