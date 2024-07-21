package com.ivoronline.springboot_database_loadscript_ddlauto.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //====================================================================================
  // GET LIST
  //====================================================================================
  @ResponseBody
  @RequestMapping("GetList")
  String getList() throws JsonProcessingException {

    //RETURN SOMETHING TO BROWSER
    return "OK";

  }

}
