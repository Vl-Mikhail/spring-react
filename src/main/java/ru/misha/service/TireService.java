package ru.misha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.misha.models.Tire;
import ru.misha.persistence.TireRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TireService {

    private final TireRepository tireRepository;

    @Autowired
    public TireService(TireRepository tireRepository) {
        this.tireRepository = tireRepository;
    }

    public Iterable<Tire> findAll() {
        return tireRepository.findAll();
    }
}
