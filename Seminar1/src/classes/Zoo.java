package classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animalList;
    private Map<Animal, String> foodDictionary = null;

    public Zoo(String name, ZooKeeper zooKeeper, List<Animal> animalList, Map<Animal, String> foodDictionary) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animalList = animalList;
        this.foodDictionary = foodDictionary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Map<Animal, String> getFoodDictionary() {
        return foodDictionary;
    }

    public void setFoodDictionary(Map<Animal, String> foodDictionary) {
        this.foodDictionary = foodDictionary;
    }

    public void feedAllAnimals() {
        for (var entry :
                foodDictionary.entrySet()) {
            zooKeeper.feedAnimal(entry.getKey(), entry.getValue());
        }
    }

    public void addAnimal(Animal animal, String food) {
        animalList.add(animal);
        if(foodDictionary == null) {
            foodDictionary = new HashMap<>();
        }
        foodDictionary.put(animal, food);
    }
}
