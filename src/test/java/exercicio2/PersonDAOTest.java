package exercicio2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.Test;
import com.example.exercicio2.Email;
import com.example.exercicio2.Person;
import com.example.exercicio2.PersonDAO;

public class PersonDAOTest {
     @Test
    public void testValidPerson() {
        Person person = new Person("fulano de tal", 40);
        person.addEmail(new Email("fulano@example.com"));
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testInvalidName() {
        Person person = new Person("fulano", 40);  
        person.addEmail(new Email("fulano@example.com"));
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Nome deve conter pelo menos duas partes e ser composto apenas de letras"));
    }
    @Test
    public void testIvalidName2(){
        Person person = new Person("ful4ano", 40);
        person.addEmail(new Email("fulano@example.com"));
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Nome deve conter pelo menos duas partes e ser composto apenas de letras"));
    }

    @Test
    public void testInvalidAge() {
        Person person = new Person("fulano de tal", 0);
        person.addEmail(new Email("fulano@example.com"));
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Idade deve estar entre 1 e 200"));
    }

    @Test
    public void testInvalidAge2() {
        Person person = new Person("fulano de tal", 305);
        person.addEmail(new Email("fulano@example.com"));
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Idade deve estar entre 1 e 200"));
    }

    @Test
    public void testNoEmail() {
        Person person = new Person("fulano de tal", 40);
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Pessoa deve possuir pelo menos um e-mail válido"));
    }

    @Test
    public void testInvalidEmail() {
        Person person = new Person("fulano de tal", 40);
        person.addEmail(new Email("invalidemail")); 
        List<String> errors = PersonDAO.isValidToInclude(person);
        assertTrue(errors.contains("Email deve estar no formato correto: '____@____.____'"));
    }
}
