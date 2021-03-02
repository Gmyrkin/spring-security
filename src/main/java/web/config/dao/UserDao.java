package web.config.dao;


import web.config.model.User;

public interface UserDao {
    User getUserByName(String name);
}

