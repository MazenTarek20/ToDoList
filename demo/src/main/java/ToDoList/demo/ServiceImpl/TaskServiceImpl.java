package ToDoList.demo.ServiceImpl;

import ToDoList.demo.Model.Task;
import ToDoList.demo.Repository.TaskRepository;
import ToDoList.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> GetTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task updatedTask) {
        Optional<Task> existingTask = taskRepository.findById(id);
        if (existingTask.isPresent()){
            Task task = existingTask.get();
            task.setTitle(updatedTask.getTitle());
            task.setDescribtion(updatedTask.getDescribtion());
            task.setPriority(updatedTask.getPriority());
            task.setDueDate(updatedTask.getDueDate());
            task.setStatus(updatedTask.getStatus());
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteAllTasks() {
        taskRepository.deleteAll();

    }
}
