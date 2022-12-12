package com.example.demo.dao;

import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
       entityManager.remove(getById(id));

    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getUsersList() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
