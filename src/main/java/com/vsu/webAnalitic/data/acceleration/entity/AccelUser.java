package com.vsu.webAnalitic.data.acceleration.entity;


import com.vsu.webAnalitic.data.raw.entity.RawProject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class AccelUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    List<RawProject> rawProjects;



}
