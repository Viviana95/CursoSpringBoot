package com.baeldung.boot.jsp.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name="books")
public class BookData {

	
	@Id
	@Column(name= "bk_isbn", length = 45)
	private String isbn;

    
	@Column(name="bk_name", length = 45)
	private String name;
	
    
    @Column(name="bk_author", length = 45)
	private String author;
    


	
}