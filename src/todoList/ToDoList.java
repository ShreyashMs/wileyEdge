package todoList;
import java.util.LinkedList;
import java.util.Queue;

public class ToDoList {
    Queue<Task> taskQueue;

    public ToDoList() {
        taskQueue = new LinkedList<>();
    }

    public void addNewTask(Task task) {
        taskQueue.add(task);
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll(); // Retrieve and remove the head of the queue
            task.markCompleted();
        } else {
            System.out.println("No pending tasks to process.");
        }
    }

    public void displayCompleted() {
        System.out.println("Completed tasks:");
        for (Task task : taskQueue) {
            if (task.completed) {
                System.out.println("Description: " + task.description + ", Duration: " + task.duration + " minutes");
            }
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Adding sample tasks
        toDoList.addNewTask(new Task("Gym", 60));
        toDoList.addNewTask(new Task("study", 45));
        toDoList.addNewTask(new Task("lunch", 30));

        toDoList.processTask();
        toDoList.processTask();
        toDoList.processTask();

//        toDoList.displayCompleted();
    }
}

