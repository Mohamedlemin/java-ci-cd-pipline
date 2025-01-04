package com.msservice.cicdtest.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Job, Long> {
}