package com.example.springflywaydemo.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "student_generator", sequenceName = "student_sequence",
            allocationSize = 1)
    @GeneratedValue(generator = "student_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CLASS_NAME")
    private String className;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, className);
    }
}
