package src.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligons = new ArrayList<>();
    }
}
