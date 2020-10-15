package com.zkdlu.blocking.repository;

import com.zkdlu.blocking.model.DefaultExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultExtensionRepo extends JpaRepository<DefaultExtension, Integer> {
}