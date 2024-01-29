package src.ModelElements;

import src.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points;

    public Poligon() {
        this.points = new ArrayList<>();
    }

    public Poligon(List<Point3D> points) {
        this.points = points;
    }
}
