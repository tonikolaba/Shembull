package bootshembulli.dao;

import org.springframework.data.repository.CrudRepository;

import bootshembulli.model.Task;

public interface TaskRepository extends CrudRepository<Task,Integer>{

}
