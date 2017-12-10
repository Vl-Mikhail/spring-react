package ru.misha.persistence;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.misha.models.Tire;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final TireRepository repository;

    @Autowired
    public DatabaseLoader(TireRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Tire("265-65-17", "3000", "winter"));
    }
}
