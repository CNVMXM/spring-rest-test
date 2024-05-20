package dev.cnvmxm.springresttest.repository;

import dev.cnvmxm.springresttest.model.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
