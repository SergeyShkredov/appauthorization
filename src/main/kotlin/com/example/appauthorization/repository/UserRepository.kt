package com.example.appauthorization.repository

import java.util.Optional
import com.example.appauthorization.jpa.User
import org.springframework.data.repository.query.Param
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

interface UserRepository: JpaRepository<User, Long> {

    fun existsByUsername(@Param("username") username: String): Boolean

    fun findByUsername(@Param("username") username: String): Optional<User>

    fun findByEmail(@Param("email") email: String): Optional<User>

    @Transactional
    fun deleteByUsername(@Param("username") username: String)

}