package dataBaseLayer;

import dataBaseLayer.products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * класс базы данных (симуляция)
 */
public class DataBase {
    private List<Product> products = new ArrayList<>();
    private static DataBase dataBase;

    /**
     * получения класса базы (синглтон)
     */
    public static DataBase getInstance(){
        if (dataBase == null){
            dataBase = new DataBase();
        }
        return dataBase;
    }

    /**
     * примерный товар
     */
    private DataBase(){
        products.add(new Product(1,"Хищник\t\t\t","Экшен фигурка хищника\t\t\t\t",3500,20));
        products.add(new Product(2,"Чужой\t\t\t\t","Экшен фигурка чужого\t\t\t\t",3500,45));
        products.add(new Product(3,"ЮСС Интерпрайз\t","модель корабля NCC 1701-D\t\t\t",4000,10));
        products.add(new Product(4,"Тысячелетний сокол","модель корабля из серии Star wars\t",4500,10));

    }

    /**
     * Геттер и сеттер товаров
     */
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
