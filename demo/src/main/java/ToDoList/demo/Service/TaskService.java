package ToDoList.demo.Service;

import ToDoList.demo.Model.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TaskService {
    public List<Task> getAllTasks();

    public Optional<Task> GetTaskById(Long id);

    public Task createTask(Task task);

    public Task updateTask(Long id, Task updatedTask);

    public void deleteTask(Long id);

    public void deleteAllTasks();

    ;



}
