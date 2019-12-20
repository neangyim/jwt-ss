package co.simplon.web;

import co.simplon.dao.TaskRepository;
import co.simplon.entites.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerRest {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String hello(){
        return "Bonjour, je suis là";
    }

    @GetMapping("/tasks")
    public List<Task> tasks(){
        return taskRepository.findAll();
    }
}
