package org.study.open_closed;

public class Triangle implements IFigure{

    private Double height;
    private Double base;

    public Triangle(Double height, Double base) {
        this.height = height;
        this.base = base;
    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }

    @Override
    public Double area(){
        return (this.base * this.height) / 2;
    }
}
