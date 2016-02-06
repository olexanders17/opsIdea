package ua.ak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ak.dao.FieldProfileDao;
import ua.ak.domain.FieldProfile;
import ua.ak.service.FieldProfileService;

@Service
public class FieldProfileServiceImpl implements FieldProfileService {

	@Autowired
	private FieldProfileDao dao;

	public FieldProfileDao getDao() {
		return dao;
	}

	public void setDao(FieldProfileDao dao) {
		this.dao = dao;
	}

	@Override
	public List<FieldProfile> getAll() {
		return dao.findAll();

	}

	@Override
	public FieldProfile findByCode(String code) {
		FieldProfile fieldProfile = null;
		List<FieldProfile> fieldProfileList = dao.findAll();

		for (FieldProfile fp : fieldProfileList) {
			if (fp.getFieldСode().equals(code)) {
				fieldProfile = fp;
			}

		}

		return fieldProfile;
	}

}
