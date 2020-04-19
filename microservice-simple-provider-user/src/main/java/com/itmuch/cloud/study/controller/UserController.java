package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;


@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {

        System.out.println("hello");
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        System.out.println("hello");

//        if (principal instanceof UserDetails) {
//            UserDetails user = (UserDetails) principal;
//
//            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
//            for (GrantedAuthority c : collection) {
//                System.out.println(user.getUsername() + c.getAuthority());
//            }
//        }


        //FIXME havan't connected to DB  P3.4
        return this.userRepository.findById(id);
    }


}
