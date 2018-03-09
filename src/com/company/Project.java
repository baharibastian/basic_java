package com.company;

public class Project {
    protected String name;
    protected int duration;
    public String project_manager;

    Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    void setProjectName(String name) {
        this.name = name;
    }

    String getProjectName(){
        return this.name;
    }

    void setDurationProject(int time) {
        this.duration = time;
    }

    int getDurationProject(){
        return this.duration;
    }

    void setProjectManager(String pm) {
        this.project_manager = pm;
    }

    String getProjectManager() {
        return this.project_manager;
    }
}
