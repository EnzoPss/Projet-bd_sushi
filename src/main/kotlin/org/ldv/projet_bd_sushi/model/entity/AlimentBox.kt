package org.ldv.projet_bd_sushi.model.entity

import jakarta.persistence.*
import org.ldv.projet_bd_sushi.model.id.AlimentBoxId

@Entity
@Table(name = "aliments_boxes")
class AlimentBox(
    @EmbeddedId
    val alimentBox: AlimentBoxId,

    @ManyToOne
    @MapsId("boxId") // On indique l'attribut correspondant sur AlimentBoxId
    @JoinColumn(name = "fk_box_id")
    //@JsonBackReference
    val box: Box,

    @ManyToOne
    @MapsId("alimentId") // On indique l'attribut correspondant sur AlimentBoxId
    @JoinColumn(name = "fk_aliment_id")
    //@JsonBackReference
    val aliment: Aliment,

    val quantite: Int
) {
}