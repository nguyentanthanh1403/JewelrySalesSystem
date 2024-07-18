package com.swp391.JewelrySalesSystem.repository;

import com.swp391.JewelrySalesSystem.entity.Material;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
  @Modifying
  @Transactional
  @Query(value = "update materials m set is_active = false where m.id = :id", nativeQuery = true)
  void deactivateMaterialById(@Param("id") Long id);
}
