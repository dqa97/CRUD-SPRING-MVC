package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Please input category name")
    @Size(max = 45)
    private String categoryName;
    @NotEmpty(message = "Please input description")
    @Size(max = 255)
    private String descripion;
    @OneToMany(mappedBy = "category")
    private Set<Product> products;

    public Category(){
    }

    public Category(Long id, @NotEmpty(message = "Please input category name") @Size(max = 45) String categoryName, @NotEmpty(message = "Please input description") @Size(max = 255) String descripion, Set<Product> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.descripion = descripion;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
