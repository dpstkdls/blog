package com.novonetworks.blog.domain.reply;

import com.novonetworks.blog.domain.board.Board;
import com.novonetworks.blog.domain.user.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne
    @JoinColumn(name="boardId")
    private Board baord;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @CreationTimestamp
    private Timestamp createDate;
}
