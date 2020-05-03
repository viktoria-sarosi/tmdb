package com.tmdbproject.repositories;

import com.tmdbproject.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User,Long> {
}
