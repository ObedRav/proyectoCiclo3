package com.udea.proyect.Services;

import com.udea.proyect.Entities.User;
import com.udea.proyect.Repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.ws.server.endpoint.support.NamespaceUtils;

import java.util.Map;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository=repository;
    }

    public User createUser(User newUser){
       return this.repository.save(newUser);
    }

    public User findUserByEmail(String email){
        return this.repository.findByEmail(email);
    }

    public User getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");

        User user = findUserByEmail(email);
        if(user== null){
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0id = (String) userData.get("sub");

            User newUser = new User(email=email, image=image, auth0id=auth0id);
            return  createUser(newUser);
        }

        return user;


   }
}
