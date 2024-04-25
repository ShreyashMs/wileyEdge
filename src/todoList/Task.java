package todoList;

public class Task {
    String description;
    int duration;
    boolean completed;

    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }
}
