package com.springboot.demo.Controller;
import com.springboot.demo.mapper.PersonsMapper;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.model.Persons;
import com.springboot.demo.model.PersonsExample;
import com.springboot.demo.model.User;
import com.springboot.demo.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
@Controller
public class HelloController {
@Autowired
private UserMapper userMapper;
@Autowired
private PersonsMapper personsMapper;
@GetMapping("hello")
public String hello() {
    return "helloo";

}

//前后端分离，使用ResponseBody注解，使用UserMapper从数据库中user表获取信息，将数据传递到页面
@ResponseBody
@RequestMapping(value = "/getuser")
public List<User> getUser(){
UserExample userExample=new UserExample();
List<User> users=userMapper.selectByExample(userExample);
return users;
}
    @ResponseBody
    @RequestMapping(value = "/getpersons")
    public List<Persons> getPersons() {
        PersonsExample personsExample = new PersonsExample();
        List<Persons> persons = personsMapper.selectByExample(personsExample);
        return persons;
    }
}