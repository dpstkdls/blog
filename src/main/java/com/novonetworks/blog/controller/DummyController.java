package com.novonetworks.blog.controller;

import com.novonetworks.blog.domain.user.User;
import com.novonetworks.blog.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@RestController
public class DummyController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/dummy/users")
    public List<User> list() {
        return userRepository.findAll();
    }

    @GetMapping("/dummy/user")
    public List<User> PageList(@PageableDefault(size=2, sort="id", direction = Sort.Direction.DESC) Pageable pageable) {
        List<User> users = userRepository.findAll(pageable).getContent();
        return users;
    }

    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new
                IllegalArgumentException("해당 유저가 없습니다.") {
                });

        return user;
    }

    @Transactional
    @PutMapping("/dummy/user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User requestUser) {
        System.out.println("id: " + id);
        System.out.println("password: " + requestUser.getPassword());
        System.out.println("email: " + requestUser.getEmail());

        User user = userRepository.findById(id).orElseThrow(() -> new
                IllegalArgumentException("해당 유저가 없습니다") {
                });

        return null;
    }

    @Transactional
    @DeleteMapping("/dummy/user/{id}")
    public String deleteUser(@PathVariable Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            return "삭제에 실패하였습니다. 해당id가 존재하지 않습니다.";
        }

        return "삭제되었습니다 id=" + id;
    }

    @PostMapping("/dummy/join")
    public String join(User user) {

        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }
}
