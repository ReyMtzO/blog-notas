package com.donRey.blognotas.presenter.services

import com.donRey.blognotas.domain.entities.NoteEntity

interface NotesService {

    fun create(note: NoteEntity): NoteEntity?

    fun get(noteId: Int): NoteEntity?
}