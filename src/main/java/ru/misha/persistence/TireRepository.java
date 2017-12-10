package ru.misha.persistence;


import org.springframework.data.repository.CrudRepository;
import ru.misha.models.Tire;

import java.util.List;

public interface TireRepository extends CrudRepository<Tire, Long> {

    /**
     * Поиск по сезону
     * @param season сезон
     * @return список резины
     */
    List<Tire> findBySeason(String season);
}
