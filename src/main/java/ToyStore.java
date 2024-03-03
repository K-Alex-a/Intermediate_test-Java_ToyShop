import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    /**
     * Добавление игрушки в магазин
     * @param toy игрушка для добавления
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * Изменение веса игрушки
     * @param toyId ID игрушки
     * @param newWeight новый вес игрушки
     */
    public void changeWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    /**
     * Выбор игрушки для розыгрыша
     * @return игрушка
     */
    public Toy drawToy() {
        double random = Math.random() * 100;
        double cumulativeWeight = 0;

        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();
            if (random <= cumulativeWeight) {
                Toy selectedToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeight());
                toy.reduceQuantity();
                return selectedToy;
            }
        }
        return null;
    }

    /**
     * Сохранение выигрыша в файл
     * @param toy игрушка
     */
    public void saveWonToyToFile(Toy toy) {
        try {
            FileWriter fileWriter = new FileWriter("won_toys.txt", true);
            String data = "ID: " + toy.getId() + ", Название: " + toy.getName() + "\n";
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
