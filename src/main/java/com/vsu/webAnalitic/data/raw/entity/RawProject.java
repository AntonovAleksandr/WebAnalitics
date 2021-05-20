package com.vsu.webAnalitic.data.raw.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "raw_projects", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class RawProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private RawUser owner;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<Session>  sessions;
}
