package com.springboot.demo.model;

public class Edge {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.edgeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer edgeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.source
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.target
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer target;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edge.weight
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float weight;

   public Edge(Integer idd,Integer edgeidd,Integer sourced,Integer targetd,Float weightd)
    {
       id=idd;
       edgeid=edgeidd;
       source=sourced;
       target=targetd;
       weight=weightd;

    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.id
     *
     * @return the value of edge.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.id
     *
     * @param id the value for edge.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.edgeid
     *
     * @return the value of edge.edgeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getEdgeid() {
        return edgeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.edgeid
     *
     * @param edgeid the value for edge.edgeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setEdgeid(Integer edgeid) {
        this.edgeid = edgeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.source
     *
     * @return the value of edge.source
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.source
     *
     * @param source the value for edge.source
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.target
     *
     * @return the value of edge.target
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.target
     *
     * @param target the value for edge.target
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setTarget(Integer target) {
        this.target = target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edge.weight
     *
     * @return the value of edge.weight
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edge.weight
     *
     * @param weight the value for edge.weight
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }
}