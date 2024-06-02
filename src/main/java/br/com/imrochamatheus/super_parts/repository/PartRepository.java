package br.com.imrochamatheus.super_parts.repository;

import br.com.imrochamatheus.super_parts.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    Optional<Part> findByNameOrSerial(String name, String serial);
}
