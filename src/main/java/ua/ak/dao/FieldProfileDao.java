package ua.ak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ak.domain.FieldProfile;
import ua.ak.domain.Inputs;

public interface FieldProfileDao extends JpaRepository<FieldProfile, Long> {

}
