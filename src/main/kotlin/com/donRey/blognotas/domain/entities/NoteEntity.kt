package com.donRey.blognotas.domain.entities

data class NoteEntity(
    val noteId: Int,
    val title: String,
    val paragraph: String,
    val backgroundColor: Color?
)

data class Color(
    val name: String,
    val hexCode: String
)