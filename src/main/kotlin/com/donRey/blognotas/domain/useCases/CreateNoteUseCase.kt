package com.donRey.blognotas.domain.useCases

import com.donRey.blognotas.domain.dataSources.NoteDataSource
import com.donRey.blognotas.domain.entities.NoteEntity

class CreateNoteUseCase(private val dataSurce: NoteDataSource) {
    operator fun invoke(note: NoteEntity): NoteEntity? {
        return dataSurce.create(note)
    }
}