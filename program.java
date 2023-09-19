import java.lang.String;
import java.util.ArrayList;

public class program{
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Acer", "Model 1", "Windows", "Черный", 4, 512, 20000);
        Notebook notebook2 = new Notebook("Acer", "Model 2", "Windows", "Черный", 4, 1024, 33000);
        Notebook notebook3 = new Notebook("Samsung", "Model 1", "Windows", "Белый", 8, 128, 27000);
        Notebook notebook4 = new Notebook("Samsung", "Model 2", "Windows", "Черный", 32, 256, 33000);
        Notebook notebook5 = new Notebook("Huawei", "Model 2", "Windows", "Черный", 16, 256, 89000, "Хит-продаж!");
        Notebook notebook6 = new Notebook("Huawei", "Model 1", "Windows", "Белый", 16, 256, 50000, "Хит-продаж!");
        Notebook notebook7 = new Notebook("Acer", "Model 3", "Linux", "Белый", 8, 512, 72000);
        Notebook notebook8 = new Notebook("Acer", "Model 4", "Linux", "Черный", 16, 256, 45000);
        Notebook notebook9 = new Notebook("Acer", "Model 4", "Linux", "Белый", 8, 256, 45000);
        ArrayList<Notebook> notebookList = new ArrayList<>();
        notebookList.add(notebook);
        notebookList.add(notebook2);
        notebookList.add(notebook3);
        notebookList.add(notebook4);
        notebookList.add(notebook5);
        notebookList.add(notebook6);
        notebookList.add(notebook7);
        notebookList.add(notebook8);
        notebookList.add(notebook9);

        notebook.filter(notebookList);
    }
    
}


