package com.donRey.blognotas.data.db.repositories

import com.donRey.blognotas.data.db.entities.NoteMongoEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepository: MongoRepository<NoteMongoEntity, String> {
}