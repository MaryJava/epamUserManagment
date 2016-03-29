package com.epam.repository;

import com.epam.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sahak_Babayan on 3/29/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {



}
