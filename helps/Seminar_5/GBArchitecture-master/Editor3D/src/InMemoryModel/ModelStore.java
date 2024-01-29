package src.InMemoryModel;

import src.ModelElements.Camera;
import src.ModelElements.Flash;
import src.ModelElements.PoligonalModel;
import src.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private List<IModelChangedObserver> changedObservers; // странно что на интерфейс... // может все реализующие классы, каждый со своим update...для обновления всех составляющих картинки


    /**
     * конструктор
     *
     */
    public ModelStore(List<IModelChangedObserver> changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    /**
     * @param n id сцены
     * @return возврат сцены по ID
     */
    public Scene getScena(int n) {
        return scenes.get(n);
    }

    /**
     *
     * @param sender регистрация изменений
     */

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    public List<IModelChangedObserver> getChangedObservers() {
        return changedObservers;
    }

    public void setChangedObservers(List<IModelChangedObserver> changedObservers) {
        this.changedObservers = changedObservers;
    }
}
