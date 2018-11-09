package com.thrymr.springsecurityjwt.repository;

import com.thrymr.springsecurityjwt.model.Role;
import com.thrymr.springsecurityjwt.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Ritesh
 * @Created On 9/11/18
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(RoleName roleName);
}
