package com.zkdlu.blocking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CustomExtension {
    @Id
    @Column(name = "PR_KEY", length = 20)
    private String name;
}
