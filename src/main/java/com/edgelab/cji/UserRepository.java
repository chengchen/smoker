package com.edgelab.cji;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Integer> {
}
