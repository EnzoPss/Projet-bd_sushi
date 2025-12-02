package org.ldv.projet_bd_sushi.service

import org.ldv.projet_bd_sushi.dto.AlimentBoxDtoApi
import org.ldv.projet_bd_sushi.dto.BoxDtoApi
import org.ldv.projet_bd_sushi.model.entity.Box


fun boxToBoxDtoApi(box: Box): BoxDtoApi {
    return BoxDtoApi(
        box.boxId,
        box.nbPieces,
        box.nom,
        box.nomImage,
        box.prix,
        HashSet(box.saveurs.stream().map { it.nom }.toList()),
        box.alimentBoxes.stream().map { AlimentBoxDtoApi(it.aliment.nom, it.quantite) }.toList()
    )
}