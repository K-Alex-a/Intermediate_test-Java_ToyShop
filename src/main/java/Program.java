
public class Program {
    public static void main(String[] args) {

        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Кукла", 10, 20);
        Toy toy2 = new Toy(2, "Машинка", 5, 30);
        Toy toy3 = new Toy(3, "Мяч", 8, 50);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);

        toyStore.changeWeight(1, 10); // Изменяем вес первой игрушки
        Toy prizeToy = toyStore.drawToy(); // Розыгрыш
        if (prizeToy != null) {
            System.out.println("Поздравляем! Вы выиграли: " + prizeToy.getName());
            toyStore.saveWonToyToFile(prizeToy);
        }

    }
}