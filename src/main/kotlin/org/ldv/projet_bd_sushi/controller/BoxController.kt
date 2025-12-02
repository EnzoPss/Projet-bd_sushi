package org.ldv.projet_bd_sushi.controller

import org.ldv.projet_bd_sushi.dao.BoxDao
import org.ldv.projet_bd_sushi.dto.BoxDtoApi
import org.ldv.projet_bd_sushi.service.boxToBoxDtoApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
@CrossOrigin
class BoxController(val boxDao: BoxDao) {

    @GetMapping("/boxes")
    @CrossOrigin(origins = ["*"])
    fun allboxes(): ResponseEntity<List<BoxDtoApi>> {
        return ResponseEntity.ok(boxDao.findAll().map { boxToBoxDtoApi(it)} )
    }

}