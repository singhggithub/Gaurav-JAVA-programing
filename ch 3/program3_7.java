import java.util.*;
class ProductItem 
{
    int id;
    float price;
    ProductItem(int id , float price)
    {
        this.id = id;
        this.price = price;
    }
    public String toString()
    {
        return "ID"+id+"PRICE"+price;
    }
    float getPrice()
    {
        return price;
    }
}

class ShoppingCart
{
    int custid;
    Vector itemsv;
    ShoppingCart(int custid)    // constructor
    {
        this.custid= custid;
        itemsv = new Vector();
    }
    public void addItem(ProductItem pit)
    {
        itemsv.addElement(pit);
    } 
    public void removeItem(ProductItem pit)
    {
        itemsv.remove(pit);
    }
    public void doPayment()
    {
        float amt = 0.0f;
        for(int i = 0; i<itemsv.size();i++)
        {
            amt +=((ProductItem)itemsv.get(i)).getPrice();  // this will get only float price from productitem()

        }
        System.out.println("Total price :"+amt);
    }
}

public class program3_7
{
    public static void main(String[] args) 
    {
        int count = 0;
        ShoppingCart sc = new ShoppingCart(1);

        ProductItem it1 = new ProductItem(count++, 200);
        sc.addItem(it1);
        ProductItem it2 = new ProductItem(++count, 300);
        sc.addItem(it2);
        ProductItem it3 = new ProductItem(++count, 1300);
        sc.addItem(it3);
        ProductItem it4 = new ProductItem(++count, 1000);
        sc.addItem(it4);
        sc.removeItem(it3);
        System.out.println();
        sc.doPayment();
        System.out.println();
    }
}