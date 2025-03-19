package com.MooBoo.MooBoo_Spring;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="test_table")
@NoArgsConstructor
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Long id;

    private String username;
}
