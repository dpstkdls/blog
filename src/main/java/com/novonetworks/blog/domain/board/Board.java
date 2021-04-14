package com.novonetworks.blog.domain.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.novonetworks.blog.domain.reply.Reply;
import com.novonetworks.blog.domain.user.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length= 100)
    private String title;

    @Lob
    private String content;

    @ColumnDefault("0")
    private int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private User userId;

    @OneToMany(fetch= FetchType.LAZY)
    @JsonIgnoreProperties({"board"})
    @OrderBy("id desc")
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;
}
