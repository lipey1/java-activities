import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("Tarefa adicionada!\n" + taskName);
    }

    public void removeTask(String taskName) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getNome().equals(taskName)) {
                taskToRemove = task;
                break;
            }
        }

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Tarefa " + taskName + " removida!");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.getNome());
        }
    }
}
