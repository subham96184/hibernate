package guru.springframwork.sdjpaintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframwork.sdjpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
