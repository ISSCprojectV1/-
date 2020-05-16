package com.springboot.demo.model;

public class Nodee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */

    public Nodee( Integer idd,String labeld,Float sized,
                  Float xd,Float yd,Float zd,Integer rd
                  ,Integer gd,Integer bd,Float valued
                  ,Integer nodeidd
    )
    {id=idd;
    label=labeld;
    size=sized;
    x=xd;
    y=yd;
    z=zd;
    r=rd;
    g=gd;
    b=bd;
    value=valued;
    nodeid=nodeidd;


    }
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.label
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.size
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.x
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float x;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.y
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float y;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.z
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float z;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.r
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer r;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.g
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer g;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.b
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer b;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.value
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Float value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodee.nodeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    private Integer nodeid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.id
     *
     * @return the value of nodee.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.id
     *
     * @param id the value for nodee.id
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.label
     *
     * @return the value of nodee.label
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.label
     *
     * @param label the value for nodee.label
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.size
     *
     * @return the value of nodee.size
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.size
     *
     * @param size the value for nodee.size
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setSize(Float size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.x
     *
     * @return the value of nodee.x
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getX() {
        return x;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.x
     *
     * @param x the value for nodee.x
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setX(Float x) {
        this.x = x;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.y
     *
     * @return the value of nodee.y
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getY() {
        return y;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.y
     *
     * @param y the value for nodee.y
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setY(Float y) {
        this.y = y;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.z
     *
     * @return the value of nodee.z
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getZ() {
        return z;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.z
     *
     * @param z the value for nodee.z
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setZ(Float z) {
        this.z = z;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.r
     *
     * @return the value of nodee.r
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getR() {
        return r;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.r
     *
     * @param r the value for nodee.r
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setR(Integer r) {
        this.r = r;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.g
     *
     * @return the value of nodee.g
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getG() {
        return g;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.g
     *
     * @param g the value for nodee.g
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setG(Integer g) {
        this.g = g;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.b
     *
     * @return the value of nodee.b
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getB() {
        return b;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.b
     *
     * @param b the value for nodee.b
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setB(Integer b) {
        this.b = b;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.value
     *
     * @return the value of nodee.value
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Float getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.value
     *
     * @param value the value for nodee.value
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodee.nodeid
     *
     * @return the value of nodee.nodeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public Integer getNodeid() {
        return nodeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodee.nodeid
     *
     * @param nodeid the value for nodee.nodeid
     *
     * @mbg.generated Wed May 13 15:22:44 CST 2020
     */
    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }
}