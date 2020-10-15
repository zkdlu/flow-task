package com.zkdlu.blocking.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class DefaultExtension {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    @Column(unique = true)
    private String name;

    @NonNull
    private boolean blocked;
}