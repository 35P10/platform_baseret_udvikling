package com.examen2.springboot.web;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.springboot.SpringBootDemoController;
import com.makotojava.learn.odot.exception.ServiceException;
import com.makotojava.learn.odot.model.Item;

@RestController
@RequestMapping("/ItemRestService")
public class ItemRestService extends SpringBootDemoController {

  @RequestMapping("/FindAll")
  public List<Item> findAllItems() {
    return getItemService().findAll();
  }


  @RequestMapping(value = "/Add", method = RequestMethod.PUT)
  public Item add(@RequestBody Item item) {
    Item ret;
    try {
      ret = getItemService().add(item);
    } catch (ServiceException e) {
      throw new RuntimeException("Could not add Item: " + ReflectionToStringBuilder.toString(item), e);
    }
    return ret;
  }

}
