package com.donRey.blognotas.domain.dataSources

import com.donRey.blognotas.domain.entities.NoteEntity

interface NoteDataSource {

    fun create(note: NoteEntity): NoteEntity?

    fun get(noteId: Int): NoteEntity?
}