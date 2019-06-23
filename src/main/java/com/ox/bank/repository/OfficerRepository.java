package com.ox.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ox.bank.entity.Officer;
@Repository
public interface OfficerRepository extends JpaRepository<Officer, Long> {

}
