package com.example.todoapplication.Utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class ToDo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeToDo(): List<ToDo> {
    return listOf<ToDo>(
        ToDo(1, "This is First Todo", Date.from(Instant.now())),
        ToDo(1, "This is Second Todo", Date.from(Instant.now())),
        ToDo(1, "This is Third Todo", Date.from(Instant.now())),
        ToDo(1, "This is Fourth Todo", Date.from(Instant.now())),
        ToDo(1, "This will be Fifth Todo", Date.from(Instant.now())),
        ToDo(1, "This will be Sixth Todo", Date.from(Instant.now()))
    )

}
