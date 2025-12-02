package org.ldv.projet_bd_sushi.dao

import org.ldv.projet_bd_sushi.model.entity.Aliment
import org.springframework.data.jpa.repository.JpaRepository

interface AlimentDao: JpaRepository<Aliment, Long> {
}