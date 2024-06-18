package dio.aula_spring_data_jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_spring_data_jpa.model.User;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Ethelberto");
        user.setUserName("Ethel");
        user.setPassword("teste");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
