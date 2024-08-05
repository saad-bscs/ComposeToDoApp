package com.example.todoapplication.Utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object ToDoManager {

    private val todoList = mutableListOf<ToDo>()

    fun getAllTodo(): List<ToDo> {
        return todoList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String) {
        todoList.add(ToDo(System.currentTimeMillis().toInt(), title, Date.from(Instant.now())))
    }

    fun deleteTodo(id: Int) {
        todoList.removeIf {
            it.id == id
        }
    }
}