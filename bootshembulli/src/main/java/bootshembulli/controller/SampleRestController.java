package bootshembulli.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootshembulli.model.Task;
import bootshembulli.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Pershendetje Miq!!!";
	}
	
	/*@GetMapping("/all-tasks")
	public String allTasks(){
		return taskService.findAll().toString();
	}
	
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Task Saved!";
	}
	
	@GetMapping("/delete-task")
	public String saveTask(@RequestParam int id){
		taskService.delete(id);
		return "Task Deleted!";
	}*/
}
