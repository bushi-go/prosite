package fr.dev.rgoussu.prositeapi.user.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dev.rgoussu.prositeapi.user.model.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}