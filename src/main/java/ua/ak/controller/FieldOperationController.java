package ua.ak.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.ak.domain.FieldOperation;
import ua.ak.domain.FieldProfile;
import ua.ak.domain.YieldHistory;
import ua.ak.service.FieldOperationService;
import ua.ak.service.FieldProfileService;
import ua.ak.service.YieldHistoryService;
import ua.ak.utils.AllFieldsTableUtil;
import ua.ak.utils.JsonCalendarData;

@Controller
public class FieldOperationController {

	@Autowired
	FieldOperationService service;

	@Autowired
	FieldProfileService fieldProfileService;

	@Autowired
	YieldHistoryService yieldHistoryService;

	public YieldHistoryService getYieldHistoryService() {
		return yieldHistoryService;
	}

	public void setYieldHistoryService(YieldHistoryService yieldHistoryService) {
		this.yieldHistoryService = yieldHistoryService;
	}

	public FieldOperationService getService() {
		return service;
	}

	public void setService(FieldOperationService service) {
		this.service = service;
	}

	public FieldProfileService getFieldProfileService() {
		return fieldProfileService;
	}

	public void setFieldProfileService(FieldProfileService fieldProfileService) {
		this.fieldProfileService = fieldProfileService;
	}

	@RequestMapping(value = "/calendar")
	public String calendar(Model model) {

		List<FieldOperation> list = service.getAll();
		String calendarData = new JsonCalendarData().getJsonCalendarData(list);
		model.addAttribute("calendarData", calendarData);

		return "calendar";
	}

	@RequestMapping(value = "/fileLoadForm")
	public String fieldLoadForm() {

		return "fileLoadForm";
	}

	@RequestMapping(value = "/fileLoad", method = RequestMethod.POST)
	public String fieldLoad(Model model, @RequestParam("file") MultipartFile file) {

		String name = "ggg";
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name)));
				stream.write(bytes);
				stream.close();

			} catch (Exception e) {

			}
		} else {

		}

		// service.fromExceltoDatabse();
		return "redirect:/";

	}

	@RequestMapping(value = "/dataTable")
	public String dataTable(Model model) {
		// service.fromExceltoDatabse();
		List<FieldOperation> list = service.getAll();
		model.addAttribute("fieldOperationList", list);
		return "data-table";

	}

	@RequestMapping(value = "/mait1")
	public String updateData(Model model) {
		service.updateBudgetDataNames();

		return "redirect:/";

	}

	@RequestMapping(value = "/fieldsInfo")
	public String fieldsInfo(Model model,

	@RequestParam(required = false) String fieldCode

	) {
		// List<AllFieldsTableUtil> avb = service.ActBudgetAllfields();

		FieldProfile fieldProfile = fieldProfileService.findByCode(fieldCode);

		model.addAttribute("fieldProfile", fieldProfile);
		model.addAttribute("fieldProfileList", fieldProfileService.getAll());
		
		model.addAttribute("yieldHistoryList", yieldHistoryService.getByFieldCode(fieldCode));

		for (YieldHistory it : yieldHistoryService.getByFieldCode(fieldCode)) {
			System.out.println(it);
		}

		return "fields-info";

	}

}
