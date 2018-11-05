package com.edgelab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@Table(name = "users")
@Setter
@Getter
class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String name;

}
