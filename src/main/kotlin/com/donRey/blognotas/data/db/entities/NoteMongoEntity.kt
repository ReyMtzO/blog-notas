package com.donRey.blognotas.data.db.entities

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class NoteMongoEntity(
    val noteId: Int,
    val title: String,
    val paragraph: String,
    val backgroundColor: MongoColor?,
    @Id
    val id: ObjectId = ObjectId.get(),
)

data class MongoColor(
    val name: String,
    val hexCode: String
)