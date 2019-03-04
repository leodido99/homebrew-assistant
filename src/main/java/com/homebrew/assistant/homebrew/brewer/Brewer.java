package com.homebrew.assistant.homebrew.brewer;

import com.homebrew.assistant.homebrew.model.Person;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "brewers")
public class Brewer extends Person {
    @Column(name = "user_name")
    @NotEmpty
    private String userName;

    public Brewer() {
        super();
    }

    public Brewer(String userName, String firstName, String lastName) {
        super(firstName, lastName);
        this.userName = userName;
    }
}
