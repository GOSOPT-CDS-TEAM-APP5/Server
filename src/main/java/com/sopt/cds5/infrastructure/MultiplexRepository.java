package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Multiplex;
import com.sopt.cds5.domain.Theater;
import org.springframework.data.repository.Repository;
import java.util.List;
public interface MultiplexRepository extends Repository<Multiplex,Long> {

    List<Multiplex> findAll();

    List<Multiplex> findAllByTheater(Theater theater);
}
