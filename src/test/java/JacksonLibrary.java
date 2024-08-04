import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.File;

public class JacksonLibrary {
    @Test
    void objectInJsonTest() {
            try {
                ObjectMapper objectMapper = new ObjectMapper();

                Library library = objectMapper.readValue(new File("resources/Book.json"), Library.class);

                System.out.println("Library Name: " + library.getName());
                for (Library.Book book : library.getBooks()) {
                    System.out.println("Book Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Published Year: " + book.getPublishedYear());
                    System.out.println();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
