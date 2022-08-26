package com.sreenutech.model;

public class TaskResult {
    private String taskName;
    private Object result;

    @Override
    public String toString() {
        return "TaskResult{" +
                "taskName='" + taskName + '\'' +
                ", result=" + result +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
