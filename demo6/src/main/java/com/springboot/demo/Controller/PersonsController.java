package com.springboot.demo.Controller;

import com.springboot.demo.mapper.PersonsMapper;
import com.springboot.demo.model.Persons;
import com.springboot.demo.model.PersonsExample;
import com.springboot.demo.model.User;
import com.springboot.demo.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


public class PersonsController {
    @Autowired
    private PersonsMapper personsMapper;

    @ResponseBody
    @RequestMapping(value = "/getpersonss")
    public List<Persons> getPersons(){
        PersonsExample personsExample=new PersonsExample();
        List<Persons> persons=personsMapper.selectByExample(personsExample);
        return persons;
    }
}
