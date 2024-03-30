package guru.springframwork.sdjpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import guru.springframwork.sdjpaintro.domain.Book;
import guru.springframwork.sdjpaintro.repositories.BookRepository;

@Profile({"local","default"})
@Component
public class DataInitializer implements CommandLineRunner {

	private final BookRepository bookRepository;
	
	public DataInitializer(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.deleteAll();
		Book book=new Book("kanoom", "1223", "jagan");
		System.out.println("id " +book.getId());
		Book book1 = bookRepository.save(book);
		System.out.println("id "+book1.getId() );
		
		Book book2=new Book("spring", "12ff", "manny");
		Book bookSa = bookRepository.save(book2);
		
		bookRepository.findAll().forEach(books ->{
			System.out.println("book id "+books.getId());
			System.out.println("book name  "+books.getTitle());
		});
		
		
	}

}
