package ua.ak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.ak.domain.FieldProfile;
import ua.ak.service.FieldProfileService;

import java.util.List;

/**
 * Created by Adm on 23.04.2016.
 */

@Controller
public class RestController2 {

    @Autowired
    FieldProfileService fieldProfileService;

    @RequestMapping(value = "/rest/fieldProfile/{fieldCode:.+}",method = RequestMethod.GET)
    @ResponseBody
    List<FieldProfile>   findAllLikeFieldcode (@PathVariable String fieldCode) {
       // fieldCode="F.LV.02.04.02";
        System.out.println("fieldCode = " + fieldCode);
        return fieldProfileService.getAllLikeFieldCode(fieldCode);
    }

}
