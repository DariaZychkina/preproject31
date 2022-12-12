package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private boolean personWatchedTheSupernatural;

    public User() {}

    public User(String name, String surname, boolean personWatchedTheSupernatural) {
        this.name = name;
        this.surname = surname;
        this.personWatchedTheSupernatural = personWatchedTheSupernatural;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Boolean getPersonWatchedTheSupernatural() {
        return personWatchedTheSupernatural;
    }
    public  void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonWatchedTheSupernatural(boolean watchedTheSupernatural) {
        this.personWatchedTheSupernatural = watchedTheSupernatural;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && personWatchedTheSupernatural == user.personWatchedTheSupernatural && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, personWatchedTheSupernatural);
    }
}
