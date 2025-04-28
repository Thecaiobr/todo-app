package com.app.todo.controller;

import com.app.todo.models.Task;
import com.app.todo.services.TaskService;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
//@RequestMapping("/tasks")
//O @GetMapping e o @RequestMapping são anotações do Spring Framework usadas para mapear requisições HTTP 
//para métodos em controladores (controllers). Eles ajudam a definir qual URL (ou rota) será tratada por um método específico.
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Handles the retrieval of tasks and adds them to the model to be displayed in the view.
     * @param model The Model object used to pass data to the view.
     * @return The name of the HTML template ("tasks") to render the tasks.
     * This method fetches a list of tasks from the taskService, adds it to the model
     * under the attribute name "tasks", and returns the name of the template that
     * should be used to render the tasks in the view.
     */
    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getTasks();
        model.addAttribute("tasks", tasks);
        return "tasks"; // This should be the name of your HTML template
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/"; // This should be the name of your HTML template
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/"; // This should be the name of your HTML template
    }

    // @GetMapping("/{id}/edit")
    // public String enableEditMode(@PathVariable Long id, Model model) {
    //     List<Task> tasks = taskService.getTasks();
    //     tasks.forEach(task -> task.setEditing(task.getId().equals(id))); // Define a tarefa em modo de edição
    //     model.addAttribute("tasks", tasks);
    //     return "tasks";
    // }

    // @PostMapping("/{id}/update")
    // public String updateTask(@PathVariable Long id, @RequestParam String title) {
    //     taskService.updateTask(id, title);
    //     return "redirect:/";
    // }
}
