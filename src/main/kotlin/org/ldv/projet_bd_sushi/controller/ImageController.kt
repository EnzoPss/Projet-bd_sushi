package org.ldv.projet_bd_sushi.controller

import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(path = ["/api/image"])
class ImageController(private val resourceLoader: ResourceLoader) {

    @GetMapping("/{imageName}")
    fun getImage(@PathVariable imageName: String): ResponseEntity<Resource> {
        //Récupération de l'image depuis sa source :
        val resource = resourceLoader.getResource("classpath:static/image/${imageName}.png")
        return if (resource.exists()) {
            ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG) //On précise la nature de l'image
                .body(resource)                         //On retourne le contenu de l'image

        } else {
            ResponseEntity.notFound().build()
        }
    }

}