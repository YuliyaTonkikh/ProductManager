import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import org.junit.jupiter.api.Test;
public class ProductRepositoryTest {
    @Test
    public void testRepositoryRemove (){
        ProductRepository repository = new ProductRepository();

        Book book1 = new Book(1, "Lord of the Rings 1", 2_000, "", "");
        Book book2 = new Book(2, "Lord of the Rings 2", 2_500, "", "");
        Book book3 = new Book(3, "Lord of the Rings 3", 2_600, "", "");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.removeByID(2);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testRepositoryRemove1 (){
        ProductRepository repository = new ProductRepository();

        Smartphone smartphone1 = new Smartphone(1, "Iphone", 50_000, "");
        Smartphone smartphone2 = new Smartphone(2, "Lenovo", 30_000, "");
        Smartphone smartphone3 = new Smartphone(3, "Samsung", 40_000, "");

        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.add(smartphone3);
        repository.removeByID(3);

        Product[] actual = repository.findAll();
        Product[] expected = {smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }

}
