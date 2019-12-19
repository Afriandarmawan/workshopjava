//2
public class Employee {
//3
    public static void main(String[] args) {
        //4
        int itemprice = 250000;
        double discount = 2.5;
        boolean isTrue = true;
        long yourmoney = 1000000;
        short counter = 0;

        //5
        System.out.println(itemprice);
        System.out.println(discount);
        System.out.println(isTrue);
        System.out.println(yourmoney);
        System.out.println(counter);

        //6
        yourmoney = yourmoney - itemprice;
        System.out.println(yourmoney);

        //7
        long byourmoney = (yourmoney - (itemprice - (long) (itemprice / 100 * discount)));
        System.out.println(byourmoney);

        //8
        System.out.println(counter++);

        //9
        System.out.println(++counter);

        //10
        boolean notTrue = !isTrue;
        System.out.println(notTrue);


        System.out.println("Hello world");
    }
}
