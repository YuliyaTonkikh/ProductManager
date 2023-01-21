import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    @Test
    public void testAdd() {
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
    public void testAdd1() {
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Smartphone smartphone1 = new Smartphone(1, "Iphone", 50_000, "", "");
        Smartphone smartphone2 = new Smartphone(1, "Lenovo", 30_000, "", "");
        Smartphone smartphone3 = new Smartphone(1, "Samsung", 40_000, "", "");

        manedger.add(smartphone1);
        manedger.add(smartphone2);
        manedger.add(smartphone3);

        Product[] actual = repository.findAll();
        Product[] expected = {smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        Smartphone smartphone = new Smartphone(1, "Lenovo", 30_000, "Lenovo", "");

        String expected = "Lenovo";
        String actual = smartphone.getManufacturer();
        ;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
        Book book = new Book(2, "state councilor", 200, "Borise Acunine", "");
        String expected = "Borise Acunine";
        String actual = book.getAutor();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Product product = new Product(1, "Book", 200, "");
        String expected = "Book";
        String actual = product.getTitle();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test6() {
        Product product = new Product(1, "Book", 200, "");
        int expected = 200;
        int actual = product.getCost();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test7() {
        Product product = new Product(1, "Book", 200, "xxx");
        String expected = "xxx";
        String actual = product.getName();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test8() {
        Product tmp = new Product(1, "nnn", 300, "...");
        String expected = "...";
        String actual = "...";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Book book1 = new Book(1, "Lord of the Rings 1", 2_000, "", "");
        Book book2 = new Book(1, "Lord of the Rings 2", 2_500, "", "");
        Book book3 = new Book(1, "Rings", 2_600, "", "");
        Smartphone smartphone = new Smartphone(7, "Nokia", 70_000, "japane", "e71");

        manedger.add(book1);
        manedger.add(book2);
        manedger.add(book3);
        manedger.add(smartphone);

        Product[] actual = manedger.searchBy("e71");

        Product[] expected = {smartphone};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test10() {
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Smartphone smartphone = new Smartphone(7, "Nokia", 70_000, "japane", "e71");

        manedger.add(smartphone);

        Product[] actual = manedger.searchBy("e71");
        Product[] expected = {smartphone};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test11() {
        ProductRepository repository = new ProductRepository();
        ProductManedger manedger = new ProductManedger(repository);
        Book book1 = new Book(1, "Lord of the Rings 1", 2_000, "", "Left");
        Book book2 = new Book(2, "Lord of the Rings 2", 2_500, "", "Left");
        Book book3 = new Book(3, "Rings", 2_600, "", "Left");
        Book book4 = new Book(4, "Left", 2_700, "", "Left");
        Book book5 = new Book(1, "Lord of the Rings 1", 2_000, "", "Right");
        Book book6 = new Book(2, "Lord of the Rings 2", 2_500, "", "Right");
        Book book7 = new Book(3, "Rings", 2_600, "", "Right");
        Book book8 = new Book(4, "Left", 2_700, "", "Right");

        manedger.add(book1);
        manedger.add(book2);
        manedger.add(book3);
        manedger.add(book4);
        manedger.add(book5);
        manedger.add(book6);
        manedger.add(book7);
        manedger.add(book8);

        Product[] actual = manedger.searchBy("Left");

        Product[] expected = {book1, book2, book3, book4};

        Assertions.assertArrayEquals(expected, actual);

    }


}
