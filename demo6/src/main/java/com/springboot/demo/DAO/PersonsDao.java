package com.springboot.demo.DAO;
import com.springboot.demo.model.Persons;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface  PersonsDao {
    /**
     * 用户数据新增
     */
    @Insert("insert into persons(id,name,age) values (#{id},#{name},#{age})")
    void addPerson(Persons person);

    /**
     * 用户数据修改
     */
    @Update("update persons set name=#{name},age=#{age} where id=#{id}")
   void updatePerson(Persons user);

    /**
     * 用户数据删除
     */
    @Delete("delete from persons where id=#{id}")
    void deletePerson(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT id,name,age FROM persons where name=#{userName}")
    Persons findByName(@Param("userName") String userName);

    /**
     * 查询所有
     */
    @Select("SELECT id,name,age FROM persons")
    List<Persons> findAll();

}
