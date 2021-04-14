package com.novonetworks.blog.repository.user;

import com.novonetworks.blog.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
}
