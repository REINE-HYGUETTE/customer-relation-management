package net.enjoy.springboot.CustomerRelationManagement.repository;

import net.enjoy.springboot.CustomerRelationManagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}