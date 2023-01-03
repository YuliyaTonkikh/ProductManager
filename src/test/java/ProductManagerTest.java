import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import static org.junit.jupiter.api.Assertions.*;
public class ProductManagerTest {
    @Test
    public void testAdd(){
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Book book1 = new Book(1, "Lord of the Rings 1", 2_000, "", "");
        Book book2 = new Book(1, "Lord of the Rings 2", 2_500, "", "");
        Book book3 = new Book(1, "Lord of the Rings 3", 2_600, "", "");

        manedger.add(book1);
        manedger.add(book2);
        manedger.add(book3);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAdd1(){
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Smartphone smartphone1 = new Smartphone(1, "Iphone", 50_000, "");
        Smartphone smartphone2 = new Smartphone(1, "Lenovo", 30_000,"");
        Smartphone smartphone3 = new Smartphone(1, "Samsung", 40_000, "");

        manedger.add(smartphone1);
        manedger.add(smartphone2);
        manedger.add(smartphone3);

        Product[] actual = repository.findAll();
        Product[] expected = {smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test3() {
        Smartphone smartphone = new Smartphone(1,"Lenovo", 30_000, "Lenovo");

        String expected = "Lenovo";
        String actual = smartphone.getManufacturer();;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void test4(){
        Book book = new Book(2, "state councilor", 200, "Borise Acunine", "");
        String expected = "Borise Acunine";
        String actual = book.getAutor();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        Product product = new Product(1, "Book", 200, "");
        String expected = "Book";
        String actual = product.getTitle();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test6(){
        Product product = new Product(1, "Book", 200,"");
        int expected = 200;
        int actual = product.getCost();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test7(){
        Product product = new Product(1, "Book", 200, "xxx");
        String expected = "xxx";
        String actual = product.getName();

        Assertions.assertEquals(expected, actual);

    }


}
