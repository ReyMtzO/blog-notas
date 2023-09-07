package com.donRey.blognotas.data.dataSource

import com.donRey.blognotas.data.db.entities.NoteMapper
import com.donRey.blognotas.data.db.entities.NoteMongoEntity
import com.donRey.blognotas.data.db.repositories.NoteRepository
import com.donRey.blognotas.domain.dataSources.NoteDataSource
import com.donRey.blognotas.domain.entities.NoteEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteDataSourceImpl @Autowired constructor(
    val repository: NoteRepository
): NoteDataSource {

    override fun create(note: NoteEntity): NoteEntity? {
        val noteMongo = NoteMapper.mapNoteEntityToNoteMongoEntity(note)
        val noteCreated: NoteMongoEntity = repository.save(noteMongo)
        return NoteMapper.mapNoteMongoEntityToNoteEntity(noteCreated)
    }

    override fun get(noteId: Int): NoteEntity? {
        TODO("Not yet implemented")
    }
}