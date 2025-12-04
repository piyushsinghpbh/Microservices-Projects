package com.user.service.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="about")
    private String about;
}
