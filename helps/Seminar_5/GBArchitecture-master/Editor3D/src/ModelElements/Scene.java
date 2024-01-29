package src.ModelElements;

import java.util.ArrayList;
import java.util.List;


public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {

        this.id = id;
        this.flashes = flashes;

        if (models.size() > 0) {
            this.models = models;
        } else throw new Exception("Должна быть, хотя-бы одна, модель");

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else throw new Exception("Должна быть, хотя-бы одна, камера");

    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }

    //заглушки

//    public Type method1(Type type){
//        return type; // or new Type() - ???   .. может тут вообще нужна Camera...
//    }
//    public Type method2(Type type1, Type2 type2){
//        return new Type();  // same here
//    }


}
