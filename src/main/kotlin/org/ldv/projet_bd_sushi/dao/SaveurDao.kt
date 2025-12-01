package org.ldv.projet_bd_sushi.dao

import org.ldv.projet_bd_sushi.model.entity.Saveur
import org.springframework.data.jpa.repository.JpaRepository

interface SaveurDao: JpaRepository<Saveur, Long> {
}