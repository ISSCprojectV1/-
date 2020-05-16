package com.springboot.demo.DAO;

import it.uniroma1.dis.wsngroup.gexf4j.core.viz.Color;

public class GexfColor implements Color {
  private int R;
    private int G;
    private int B;

    @Override
    public int getR() {
        return R;
    }

    @Override
    public Color setR(int i) {
        R=i;
        return this;
    }

    @Override
    public int getG() {
        return G;
    }

    @Override
    public Color setG(int i) {
        G=i;

        return this;
    }

    @Override
    public int getB() {
        return B;
    }

    @Override
    public Color setB(int i) {
        B=i;
        return this;
    }
}
