package ru.agaf.tests.datetimedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.agaf.tests.datetimedemo.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
