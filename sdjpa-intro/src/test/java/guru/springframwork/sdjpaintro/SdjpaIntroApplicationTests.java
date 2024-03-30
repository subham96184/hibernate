package guru.springframwork.sdjpaintro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframwork.sdjpaintro.repositories.BookRepository;

@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void testCountOfBooks() {
		long count = bookRepository.count();
		assertThat(count).isGreaterThan(0);
	}
	
	@Test
	void contextLoads() {
	}

}
