import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Tag;

public class ToDoList {
	private HashMap<String, Task> tasks = new HashMap<String, Task>();
	//private List lstTest = new ArrayList();
	
	public void addTask (Task task) {
		//Add code here
//		int task_ID = 0;
//		Map<Integer, Task> tasks = new HashMap<>();
//		Task newtask =  task;
//		tasks.put(task_ID,newtask);
//		task_ID = task_ID + 1;
		tasks.put(task.getDescription(), task);
	}
	public void completeTask(String description) {
		tasks.get(description).setComplete(true);
	}
	public boolean getStatus(String description) {
		return tasks.get(description).isComplete();
	}
	public Task getTask(String description) {
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTasks = new ArrayList<Task>();
        for (Task task: getAllTasks())
            if (task.isComplete() == true) {
            	completedTasks.add(task);
            }    	
        return completedTasks;
	}
	 public int size() {
	        return tasks.size();
	    }
}
