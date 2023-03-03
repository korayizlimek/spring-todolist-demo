package com.todolist.demo.IData;

import com.todolist.demo.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INoteData extends JpaRepository<Note, String> {
}
