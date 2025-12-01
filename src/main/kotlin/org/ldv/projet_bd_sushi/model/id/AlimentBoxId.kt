package org.ldv.projet_bd_sushi.model.id

import jakarta.persistence.Embeddable
import jakarta.persistence.Table
import java.io.Serializable


@Embeddable
@Table(name = "aliments_boxes")
open class AlimentBoxId (
    val boxId: Long,
    val alimentId: Long
): Serializable {
}