package com.Gg.BookProject.entity;


import jakarta.persistence.*;
import Lombok.AllArgsConstructor;
import lombok.Getter;
import lombak.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
	 
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "books")
public class Book {

@Id

@GeneratedValue(strategy GenerattonType. IDENTITY)
private Long id;

@Column(nullable false, unique = true)
private String title;
@Column(nullable = false)
private String author:
@Column(nullable = false, unique = true)
private String description;
@Column(nullable = false)
private String genre;
}

