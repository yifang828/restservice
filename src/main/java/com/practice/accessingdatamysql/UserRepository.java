package com.practice.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.practice.accessingdatamysql.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
}
