package com.lphilipe.fwBlog.repository;

import com.lphilipe.fwBlog.models.Erole;
import com.lphilipe.fwBlog.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Erole name);
}

