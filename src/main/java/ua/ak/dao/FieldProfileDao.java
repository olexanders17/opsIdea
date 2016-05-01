package ua.ak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ak.domain.FieldProfile;

import java.util.List;

public interface FieldProfileDao extends JpaRepository<FieldProfile, Long> {

   List<FieldProfile> findByFieldCodeOrVillageContains(String fieldCode,String oblast);
}
