package com.examen2.springboot.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.examen2.springboot.SpringBootDemoController;
import com.makotojava.learn.odot.exception.ServiceException;
import com.makotojava.learn.odot.model.Category;

@RestController
@RequestMapping("/CategoryRestService")
public class CategoryRestService extends SpringBootDemoController {
private Category category;
	
  @RequestMapping("/FindAll")
  public ResponseEntity<List<Category>> findAll() {
	List<Category> listaItem = new ArrayList<Category>();
   //return getCategoryService().findAll();
	  return new ResponseEntity<List<Category>>(category.findAll(),HttpStatus.OK);
  }
  

  @RequestMapping(value = "/Add", method = RequestMethod.PUT)
  public Category add(@RequestBody Category category) {
    Category ret;
    try {
      ret = getCategoryService().add(category);
    } catch (ServiceException e) {
      throw new RuntimeException("Could not add Category: " + ReflectionToStringBuilder.toString(category), e);
    }
    return ret;
  }



}
