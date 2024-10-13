package com.example.exercicio2;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public static List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();

        if (person.getName().split(" ").length < 2 || !person.getName().matches("[a-zA-Z ]+")) {
            errors.add("Nome deve conter pelo menos duas partes e ser composto apenas de letras");
        }

        if (person.getAge() < 1 || person.getAge() > 200) {
            errors.add("Idade deve estar entre 1 e 200");
        }

        if (person.getEmails().isEmpty()) {
            errors.add("Pessoa deve possuir pelo menos um e-mail válido");
        } else {
            for (Email email : person.getEmails()) {
                if (!email.getName().matches(".+@.+\\..+")) {
                    errors.add("Email deve estar no formato correto: '____@____.____'");
                    break; 
                }
            }
        }

        return errors;
    }
}
