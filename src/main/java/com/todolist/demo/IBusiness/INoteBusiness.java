package com.todolist.demo.IBusiness;

import com.todolist.demo.Entity.Note;

import java.util.List;
import java.util.Optional;

public interface INoteBusiness {
    void add(Note note);
    void update(Note note);
    void delete(Note note);
    List<Note> getAll();
    Optional<Note> getById(String id);
}
