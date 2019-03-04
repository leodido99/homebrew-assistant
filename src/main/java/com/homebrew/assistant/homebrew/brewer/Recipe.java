package com.homebrew.assistant.homebrew.brewer;

import com.homebrew.assistant.homebrew.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "recipes")
public class Recipe extends NamedEntity {


    //@ManyToOne
    //@JoinColumn(name = "brewer_id")
    private Brewer brewer;

    // Ingredients
    // Grain
    // Hop
    // Yeast
    // Additives
}
