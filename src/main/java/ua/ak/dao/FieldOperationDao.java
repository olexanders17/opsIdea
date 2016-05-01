package ua.ak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ak.domain.FieldOperation;

import java.util.List;
import java.util.Optional;

public interface FieldOperationDao extends JpaRepository<FieldOperation, Long> {
    //check something
    List<FieldOperation> findByFieldCode(String fieldCode);

}
