package guru.springframwork.sdjpaintro.domain;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String title;
    private String isbn;
    private String publisher;

	public Book() {

	}

	public Book(String title, String isbn, String publisher) {

		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getpublisher() {
		return publisher;
	}

	public void setpublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isbn, publisher, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id) ;
	}

	
}
