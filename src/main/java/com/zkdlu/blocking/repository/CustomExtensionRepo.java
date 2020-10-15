package com.zkdlu.blocking.repository;

import com.zkdlu.blocking.model.CustomExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomExtensionRepo extends JpaRepository<CustomExtension, String> {
}
