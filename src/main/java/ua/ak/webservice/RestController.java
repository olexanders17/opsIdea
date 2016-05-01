package ua.ak.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.ak.dao.FieldOperationDao;
import ua.ak.domain.FieldOperation;
import ua.ak.domain.YieldHistory;
import ua.ak.service.YieldHistoryService;

import java.util.List;

/**
 * Created by Adm on 24.03.2016.
 */
@Controller
@CrossOrigin
public class RestController {

    @Autowired
    YieldHistoryService yieldHistoryService;

    public YieldHistoryService getYieldHistoryService() {
        return yieldHistoryService;
    }

    public void setYieldHistoryService(YieldHistoryService yieldHistoryService) {
        this.yieldHistoryService = yieldHistoryService;
    }


    @RequestMapping(value = "/cr", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<YieldHistory> cropRotation() {


        return yieldHistoryService.getAll();
    }


    @Autowired
    FieldOperationDao dao;

    @RequestMapping(value = "/ts")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<FieldOperation> test() {

        List<FieldOperation> list=   dao.findByFieldCode("F.LV.02.04.05");

        System.out.println("list = " + list);
        
        return list;
    }


}
