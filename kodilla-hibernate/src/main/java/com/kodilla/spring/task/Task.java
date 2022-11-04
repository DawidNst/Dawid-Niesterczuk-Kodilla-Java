package com.kodilla.spring.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TASKS")
public final class Task {

    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name="DURATION")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
    @Transactional
    @Repository
    public interface TaskDao extends CrudRepository<Task, Integer> {
        List<Task> findByDuration(int duration);
    }
    @OneToOne(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
}