package com.donRey.blognotas.data.db.entities

import com.donRey.blognotas.domain.entities.Color
import com.donRey.blognotas.domain.entities.NoteEntity

object NoteMapper {
    fun mapNoteEntityToNoteMongoEntity(noteEntity: NoteEntity) = noteEntity.run{
        NoteMongoEntity(
            noteId,
            title,
            paragraph,
            backgroundColor?.toMongoColor()
        )
    }

    private fun Color.toMongoColor(): MongoColor = MongoColor(name, hexCode)

    fun mapNoteMongoEntityToNoteEntity(note: NoteMongoEntity) = note.run{
        NoteEntity(
            noteId,
            title,
            paragraph,
            backgroundColor?.toColor()
        )
    }

    private fun MongoColor.toColor() = Color(name, hexCode)
}