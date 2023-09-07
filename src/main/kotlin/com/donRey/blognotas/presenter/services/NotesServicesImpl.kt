package com.donRey.blognotas.presenter.services

import com.donRey.blognotas.domain.dataSources.NoteDataSource
import com.donRey.blognotas.domain.entities.NoteEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotesServicesImpl @Autowired constructor(
    private val dataSource: NoteDataSource
): NotesService {

    override fun create(note: NoteEntity): NoteEntity? {
        TODO("Not yet implemented")
    }

    override fun get(noteId: Int): NoteEntity? {
        TODO("Not yet implemented")
    }
}