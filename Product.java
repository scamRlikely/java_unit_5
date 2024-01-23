package inventory;
import java.util.*;
public class Product {
    //Instance declarations
    private String name; //bananas
    private String number; //1
    private String units; //3 bushels
    private String price; //13 shillings

    public Product(){
        final String name = "bananas";
        final byte number = 1;
        final int units = 3;
        final int price = 13;
    }

    public Product(String name, String price, String units, String number){
        this.name = name;
        this.units = units;
        this.price = price;
        this.number = number;
    }


    public String toString(String temp){
        Scanner scan = new Scanner(System.in);
        String temp2 = scan.nextLine();
        if(temp == "name"){
            return temp2;
        } else if (temp == "units"){
            return temp2;
        } else if (temp == "price"){
            return temp2;
        } else if (temp == "number"){
            return temp2;
        }else {
            return null;
        }
    }

    public String getName(String name){
        return name;
    }
     public int getUnits(int units){
        return units;
    }
     public int getPrice(int price){
        return price;
    }
     public byte getNumber(byte number){
        return number;
    }
     public String setName(String name){
        return name;
    }
     public int setUnits(int units){
        return units;
    }
     public int setPrice(int price){
        return price;
    }
     public byte setNumber(byte number){
        return number;
    }
    public static void main(String[] args){
        

    }

}
