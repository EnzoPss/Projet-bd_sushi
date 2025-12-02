package org.ldv.projet_bd_sushi.dao

import org.ldv.projet_bd_sushi.model.entity.AlimentBox
import org.ldv.projet_bd_sushi.model.id.AlimentBoxId
import org.springframework.data.jpa.repository.JpaRepository

interface AlimentBoxDao: JpaRepository<AlimentBox, AlimentBoxId> {
}