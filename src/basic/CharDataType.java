package basic;

public class CharDataType {
    static void main(String[] args) {
        // typecasting - means ek data type sa dusra ma jana ho jab use karta hai
       char ch = 'A';
        int x = ch; // implicit typecasting
        System.out.println(x);
        char hemant = 'a';
        int y = (int)hemant; // explicit typecasting
        System.out.println(y);
    }
}
