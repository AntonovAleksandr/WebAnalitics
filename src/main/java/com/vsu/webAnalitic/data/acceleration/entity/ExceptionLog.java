package com.vsu.webAnalitic.data.acceleration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "exception_logs", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "movie")
    private String base64Movie;
    @Column(name = "date")
    private Date date;
    @Column(name = "description")
    private String description;
    @Column(name = "response_number")
    private Long responseNumber;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

}
