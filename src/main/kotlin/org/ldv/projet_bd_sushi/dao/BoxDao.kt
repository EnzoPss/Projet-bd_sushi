package org.ldv.projet_bd_sushi.dao

import org.ldv.projet_bd_sushi.model.entity.Box
import org.springframework.data.jpa.repository.JpaRepository

interface BoxDao: JpaRepository<Box, Long> {
}