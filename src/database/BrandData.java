package database;

import models.Brand;

import java.util.ArrayList;

public class BrandData {
    public static ArrayList<Brand>getBrandData(){
        ArrayList<Brand> brands = new ArrayList<>();
        brands.add(new Brand("Asus"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Acer"));
        brands.add(new Brand("Dell"));
        brands.add(new Brand("Hp"));
        return brands;


    }
}
