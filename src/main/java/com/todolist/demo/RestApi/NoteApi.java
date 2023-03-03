package com.todolist.demo.RestApi;

import com.todolist.demo.Entity.Note;
import com.todolist.demo.IBusiness.INoteBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/note")
@CrossOrigin
public class NoteApi {
    private INoteBusiness noteService;
    @Autowired
    public NoteApi(INoteBusiness noteService) {
        this.noteService = noteService;
    }
    @GetMapping("/list")
    public List<Note> get(){
        return this.noteService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Note note){
        this.noteService.delete(note);
    }

    @PostMapping("/add")
    public void add(@RequestBody Note note){
        this.noteService.add(note);

    }

    @PostMapping("/update")
    public void update(@RequestBody Note note){
        this.noteService.update(note);
    }

    @GetMapping("/{id}")
    public Optional<Note> getById(@PathVariable String id){
        return this.noteService.getById(id);
    }
}
