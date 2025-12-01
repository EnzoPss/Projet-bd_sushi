package org.ldv.projet_bd_sushi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments")
class Aliment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alimentId: Long,

    val nom: String,

    @OneToMany(mappedBy = "aliment") // aliment est l'attribut d'AlimentBox
    val alimentBoxes : MutableList<AlimentBox>
) {
}