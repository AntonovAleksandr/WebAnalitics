package com.vsu.webAnalitic.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exeption_logs", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "response_id")
    private int responseId;
    @Column(name = "user_id")
    private int userId;
}
