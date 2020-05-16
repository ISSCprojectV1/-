package com.springboot.demo.Controller;
import com.springboot.demo.mapper.*;
import com.springboot.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HelloController {
@Autowired
private UserMapper userMapper;
@Autowired
private PersonsMapper personsMapper;
@Autowired
    private Dormitory1Mapper dormitory1Mapper;
    @Autowired
    public EdgeMapper edgeMapper;
    @Autowired
    public NodeeMapper nodeMapper;
private getAllGraphController get;
@GetMapping("hello")
public String hello() {
    return "helloo";

}

//前后端分离，使用ResponseBody注解，使用UserMapper从数据库中user表获取信息，将数据传递到页面
@ResponseBody
@RequestMapping(value = "/getuser")
public List<User> getUser(){
  //  get=new getAllGraphController();
  //  get.getgexf();
UserExample userExample=new UserExample();
List<User> users=userMapper.selectByExample(userExample);
return users;


}
    public ResponseEntity<FileSystemResource> export(File file) {

        if (file == null) {

            return null;

        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + System.currentTimeMillis() + ".gexf");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Last-Modified", new Date().toString());
        headers.add("ETag", String.valueOf(System.currentTimeMillis()));
        return ResponseEntity .ok() .headers(headers) .contentLength(file.length()) .contentType(MediaType.parseMediaType("application/octet-stream")) .body(new FileSystemResource(file));
    }
    @ResponseBody
    @RequestMapping(value = "/getuserr")
    public ResponseEntity<FileSystemResource> getUserr() {
        get = new getAllGraphController();

        EdgeExample userExample = new EdgeExample();
        List<Edge> users = edgeMapper.selectByExample(userExample);
        NodeeExample nodeex = new NodeeExample();
        List<Nodee> nodexs = nodeMapper.selectByExample(nodeex);

        get.getgexf(users, nodexs);
        return export(new File("D:\\test.static_graph_sample.gexf"));
    }

    @ResponseBody
    @RequestMapping(value = "/getonenode/{id}")
    public ResponseEntity<FileSystemResource>getonenode(@PathVariable Integer id) {
              get = new getAllGraphController();
        NodeeExample nodeex = new NodeeExample();
        List<Nodee> nodexs = nodeMapper.selectByExample(nodeex);
        System.out.println(id);
        List<Edge> users = edgeMapper.findAllId(id);
        List<Integer>ids=new ArrayList<Integer>() ;
        List<Nodee>nodessss=new ArrayList<Nodee>() ;

        for (int i = 0; i < users.size(); i++) {
          Edge ee=  users.get(i);
            if(ids.contains(ee.getTarget())!=true)
                ids.add(ee.getTarget());
            if(ids.contains(ee.getSource())!=true)
                ids.add(ee.getSource());

        }
        for (int i = 0; i < ids.size(); i++) {
             for (int j=0;j<nodexs.size();j++) {
                 if(nodexs.get(j).getNodeid()==ids.get(i)&&(nodessss.contains(nodexs.get(j))!=true))
                 nodessss.add(nodexs.get(j));
             }

        }
        get.getgexf(users,nodessss);
        return export(new File("D:\\test.static_graph_sample.gexf"));
}




    @ResponseBody
    @RequestMapping(value = "/getpersons")
    public List<Persons> getPersons() {
        PersonsExample personsExample = new PersonsExample();
        List<Persons> persons = personsMapper.selectByExample(personsExample);
        return persons;
    }
    @ResponseBody
    @RequestMapping(value = "/getdoms")
    public List<Dormitory1> getdoms() {
       Dormitory1Example dormitory1Example = new  Dormitory1Example();
        List<Dormitory1> dormitory1 = dormitory1Mapper.selectByExample( dormitory1Example);
        return dormitory1;
    }
}