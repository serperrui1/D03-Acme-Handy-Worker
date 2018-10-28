package domain;

import java.util.List;

public class Customer extends Actor{
	private Double score;
	private List<FixUpTask> tasks;
	
	
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public List<FixUpTask> getTasks() {
		return tasks;
	}
	public void setTasks(List<FixUpTask> tasks) {
		this.tasks = tasks;
	}
	
	

}
