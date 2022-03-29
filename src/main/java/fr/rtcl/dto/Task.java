/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rtcl.dto;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "todolist")
public class Task implements Serializable {

    private int id;
    private String title;
    private String description;
    private boolean state = false;
    List<Task> tasks = new ArrayList<>();

    public Task() {

    }

    public Task(int id, String title, String description, boolean state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(length = 100, nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStated() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
