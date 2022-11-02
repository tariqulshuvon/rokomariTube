package com.rokomari.rokomariTube.reporitory;


import com.rokomari.rokomariTube.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
