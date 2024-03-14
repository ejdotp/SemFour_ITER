import java.util.*;

class Product
{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Stream_API1
{
    public static void main(String[] args)
    {
        List<Product>  productList = new ArrayList<Product>();
        //Adding Products:
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(3, "Sony Laptop", 28000f));
        productList.add(new Product(3, "Apple Laptop", 90000f));

        List<Float>  productPriceList = new ArrayList<Float>();
        for(Product p : productList)
            //filtering data of list
            if(p.price<30000)
                productPriceList.add(p.price);

        System.out.println(productPriceList);
        
    }
}
/*
[25000.0, 28000.0, 28000.0]
 */
