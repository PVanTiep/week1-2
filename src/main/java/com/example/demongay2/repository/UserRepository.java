package com.example.demongay2.repository;

import com.example.demongay2.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();
    @PostConstruct
    public void GenerateUser(){
        users.add(new User("1","Van Tiep","22","choi game"));
        users.add(new User("2","Duc Hieu","25","doc sach"));
        users.add(new User("3","Quyen Linh","24","nghe nhac"));
        users.add(new User("4","Kim Thoa","21","choi Tiep"));
        users.add(new User("5","Thanh Thuy","23","da banh"));
    }
    public List<User> listUsers(){
        return users;
    }
    public User getUser(String Id){
        for (User user : users){
            if (user.getId().equals(Id)) {
                return new User(user.getId(), user.getName(), user.getAge(), user.getHobby());
            }
        }
        return null;
    }


}
