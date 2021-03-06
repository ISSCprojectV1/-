package com.springboot.demo.mapper;

import com.springboot.demo.model.Edge;
import com.springboot.demo.model.EdgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EdgeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    long countByExample(EdgeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int deleteByExample(EdgeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int insert(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int insertSelective(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    List<Edge> selectByExampleWithRowbounds(EdgeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    List<Edge> selectByExample(EdgeExample example);
    List<Edge> findAllId(Integer id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    Edge selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") Edge record, @Param("example") EdgeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int updateByExample(@Param("record") Edge record, @Param("example") EdgeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int updateByPrimaryKeySelective(Edge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edge
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    int updateByPrimaryKey(Edge record);
}