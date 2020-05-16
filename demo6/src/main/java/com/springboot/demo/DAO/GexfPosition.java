package com.springboot.demo.DAO;

import it.uniroma1.dis.wsngroup.gexf4j.core.viz.Position;

public class GexfPosition implements Position {
    private float x;
    private float y;
    private float z;
    @Override
    public float getX() {
        return x;
    }

    @Override
    public Position setX(float v) {
        x=v;
        return this;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public Position setY(float v) {
        y=v;
        return this;
    }

    @Override
    public float getZ() {
        return z;
    }

    @Override
    public Position setZ(float v) {
        z=v;
        return this;
    }
}
