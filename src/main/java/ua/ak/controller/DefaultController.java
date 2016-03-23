package ua.ak.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import ua.ak.service.FieldOperationService;

@Controller
public class DefaultController {

	@Autowired
	FieldOperationService service;

	@RequestMapping(value = { "/", "/home" })
	public String mainPage() {
		return "base.definition";
	}

	@RequestMapping(value = "/uplodFileForm")
	public String upoadFile() {
		return "uplod-file-form";
	}

	@RequestMapping(value = "/uplodFileResult")
	public String upoadFileResult(@RequestParam("name") String name, @RequestParam("file") MultipartFile file, HttpServletRequest req, Model model) {

		String fullServerPath = req.getServletContext().getRealPath("/resources/ufiles/");
		name = "Ops.xlsx";
		File fileToSave = new File(fullServerPath + name);

		try {

			byte[] fileByresArray = file.getBytes();
			FileUtils.writeByteArrayToFile(fileToSave, fileByresArray, false);

		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		model.addAttribute("uploadResult", "OK");
		File fileOnServer = new File(fullServerPath + name);
		Path path = Paths.get(fileOnServer.getAbsolutePath());

		try {
			BasicFileAttributes basicAttributes = Files.readAttributes(path, BasicFileAttributes.class);
			// System.out.println(basicAttributes.);
			model.addAttribute("name", path.getFileName());
			model.addAttribute("size", basicAttributes.size());
			model.addAttribute("lastModifiedTime", basicAttributes.lastModifiedTime().toString());
			model.addAttribute("lastAccessTime", basicAttributes.lastAccessTime().toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "upload-file-result";
	}

	@RequestMapping(value = "/updateFromFile")
	public String updateFromFile(HttpServletRequest req) {
		
		String filename = req.getServletContext().getRealPath("/resources/ufiles/Ops.xlsx");
		File file = new File(filename);
		if (!file.exists()) {
			System.out.println("File not found");
			return "redirect:/adminPanel";
		}
		
		
		service.deleteAll();
		service.fromExceltoDatabse(filename);

		return "redirect:/adminPanel";
	}

	
	@RequestMapping(value="/adminPanel")
	public String  adminPanel(){
		return "admin-panel";
		
	}
	
	

	@RequestMapping (value="/test")
	public String  test(){
		service.test();
		
		return "redirect:/";
		
	}
	
	
	@RequestMapping(value="/fieldInfo")
	public String  fieldInfo(){
		service.test();
		
		return "redirect:/";
		
	}
	
	
	
	
	
	
	
}
