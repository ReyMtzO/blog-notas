package com.donRey.blognotas.presenter.controllers

import com.donRey.blognotas.domain.entities.NoteEntity
import com.donRey.blognotas.presenter.services.NotesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/api/notes")
class NotesController @Autowired constructor(
    val notesService: NotesService
) {

    @PostMapping
    fun createNote(@RequestBody note: NoteEntity): ResponseEntity<NoteEntity> {
        val noteCreated: NoteEntity? = notesService.create(note)
        if (noteCreated != null) return ResponseEntity.created(URI("/api/notes")).body(noteCreated)
        return ResponseEntity.internalServerError().build()
    }

    @GetMapping
    fun getNote(@RequestBody noteId: Int): ResponseEntity<NoteEntity> {
        val noteFound: NoteEntity? = notesService.get(noteId)
        if (noteFound != null) return ResponseEntity.ok().body(noteFound)
        return ResponseEntity.internalServerError().build()
    }
}