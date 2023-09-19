import java.util.*;

public class Notebook {
    private String  maker, model, operationSystem, color, comment;
    private int RAM, hardDrive, price;
    public Notebook(String maker, String model, String operationSystem, String color, int RAM, int hardDrive, int price){
        this.color = color;
        this.hardDrive = hardDrive;
        this.maker = maker;
        this.RAM = RAM;
        this.operationSystem = operationSystem;
        this.model = model;
        this.price = price;

    }
    public Notebook(String maker, String model, String operationSystem, String color, int RAM, int hardDrive, int price, String comment){
        this.color = color;
        this.hardDrive = hardDrive;
        this.maker = maker;
        this.RAM = RAM;
        this.operationSystem = operationSystem;
        this.model = model;
        this.price = price;
        this.comment = comment;
    }
    private void navigation(){
        System.out.println("""
                Критерии поиска:\s
                1 - ОЗУ
                2 - Объем ЖД
                3 - Операционная система
                4 - Цвет
                5 - Не дороже
                6 - Не дешевле
                7 - Поиск""");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
    }
    @Override
    public String toString() {
        return "Ноутбук: " + this.maker + " " + this.model + "\nОС: " + this.operationSystem + "\nRAM: "
                + this.RAM + "\nОбъем HD:" + this.hardDrive + "\nЦвет: " + this.color + "\nДополнительно: " + this.comment + "\n\n";
    }
    void filter(ArrayList<Notebook> notebookList){
        navigation();
        Map<Integer, String> mapFilter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int filter = scanner.nextInt();
        Scanner scanners = new Scanner(System.in);
        while (filter != 7) {
            System.out.println("Введите значение критерия: ");
            String filterText = scanners.nextLine().toLowerCase();
            mapFilter.put(filter, filterText);
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            filter = scanner.nextInt();
        }
        search(notebookList, mapFilter);

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private void search(ArrayList<Notebook> notebookList, Map<Integer, String> mapFilter){
        ArrayList<Notebook> searchNotebook = new ArrayList<>();
        for (Notebook obj : notebookList
             ) {
            for (int item : mapFilter.keySet()
                 ) {
                if (item == 1 && Integer.parseInt(mapFilter.get(item)) != obj.RAM){
                    break;
                }
                if (item == 2 && Integer.parseInt(mapFilter.get(item)) != obj.hardDrive){
                    break;
                }
                if (item == 3 && !mapFilter.get(item).equals(obj.operationSystem.toLowerCase())){
                    break;
                }
                if (item == 4 && !mapFilter.get(item).equals(obj.color.toLowerCase())){
                    break;
                }
                if (item == 5 && obj.price > Integer.parseInt(mapFilter.get(item))){
                    break;
                }
                if (item == 7 && obj.price < Integer.parseInt(mapFilter.get(item))){
                    break;
                }
                searchNotebook.add(obj);
            }
        }
        System.out.println(searchNotebook);
    }

}
