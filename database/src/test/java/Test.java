import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import model.student
public class Test {
    @ContextConfiguration("classpath*:database-context.xml")
    public class MyTest extends AbstractTestNGSpringContextTests {

        @Autowired
        student student;



        @org.testng.annotations.Test
        public void testBean() {
            stu
            book.setName("java ee");
            book.setPrice(65.8f);


            author2.setName("lou");
            author2.setEmail("321@qq.com");
            author2.getPhones().add("13600000000");
            author1.setEmail("123@qq.com");
            author1.getPhones().add("19900000000");
            author1.getPhones().add("15600000000");
            author1.setName("chen");



            book.getAuthors().add(author1);
            book.getAuthors().add(author2);

        }

        @org.testng.annotations.Test
        public void testService() {


        }

        @org.testng.annotations.Test
        public void testBusiness() {
            saleService.insertBook(book);

            saleService.onSale(0.5f);
        }

    }
