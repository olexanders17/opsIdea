package ua.ak.service;

import java.util.List;

import ua.ak.domain.FieldProfile;

public interface FieldProfileService {

	FieldProfile findByCode(String code);


	 List<FieldProfile> getAll();

	List<FieldProfile> getAllLikeFieldCode(String fieldCode);
}