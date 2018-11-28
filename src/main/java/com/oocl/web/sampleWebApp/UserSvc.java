package com.oocl.web.sampleWebApp;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserSvc {


    private List<User> users;
/*

    public UserSvc() {
        this.users = new ArrayList<>();
        this.users.add(new User("alibaba1"));

    }
*/
    public List<User> getAll() {

        return this.users;
    }
}
/*
    public int create(User user) {
        this.idIndex = this.idIndex + 1;
        user.setId(idIndex);
        this.users.add(user);
        return idIndex;
    }

    public boolean update(int usereId, User updatedUser) {
        boolean isSuccess = false;
        Optional<User> optionalUser = findUserById(usereId);
        if (optionalUser.isPresent()) {
            this.users.remove(optionalUser.get());
            updatedUser.setId(usereId);
            this.users.add(updatedUser);
            isSuccess = true;
        }
       return isSuccess;
    }

    private Optional<User> findUserById(int usereId) {
        return this.users.stream()
                .filter(userElement -> userElement.getId() == usereId)
               .findFirst();
    }

    public boolean delete(int usereId) {
        boolean isSuccess = false;
        Optional<User> user = findUserById(usereId);
        if (user.isPresent()) {
            this.users.remove(user.get());
            isSuccess = true;
        }
        return isSuccess;
    }
}
*/
