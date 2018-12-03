package exibitionPack;
import otherClasses.Book;
import otherClasses.Vase;
import orderPack.Order;
import otherClasses.Picture;

/*
Построить иерархию объектов. Показать использование и понимание принципов
 инкапсуляции, наследования, полиморфизма. В классах должны быть поля, конструкторы,
  методы. Обязательным   является переопределение методов класса Object
   toString(), equals(), hashCode(). Использовать абстрактные классы и интерфейсы.
    Собрать коллекции объектов.
 */
public class Main {

    public static void main(String[] args) {

        Order order1 = new Order();
        Book book1 = new Book(1998, 24, 25, "Belarus");
        Picture picture1 = new Picture(2000, 21, 21, "Oval" );
        Vase vase1 = new Vase (2018, 10, 10, "New Factory");
        order1.addExibition(book1);

        Book book2 = new Book();
        book2.setCountry("Belarus");
        book2.setCost(222);
        book2.setPrice(333);
        book2.setYear(1998);
        order1.addExibition(book2);
        order1.addExibition(picture1);
        order1.addExibition(vase1);
        order1.printOrder();

        order1.countPrice();
        System.out.println("Hash" + order1.hashCode());
        System.out.println("Equals" + book1.equals(book2));
        order1.printOrder();

    }
}
