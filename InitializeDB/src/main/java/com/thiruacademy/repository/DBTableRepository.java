package com.thiruacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiruacademy.entity.DBTable;
@Repository
public interface DBTableRepository extends JpaRepository<DBTable, Long> {

}
