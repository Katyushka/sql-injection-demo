package com.sqlInjection.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by user on 30.05.16.
 */


@Controller
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);


    @RequestMapping(value = "/index", method = RequestMethod.POST, params = {"enter"})
    public String generatingTable(Model model) {


        return "index";
    }

}
