package br.com.padaria.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;
    private String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
