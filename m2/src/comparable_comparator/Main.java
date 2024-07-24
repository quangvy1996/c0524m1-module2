package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"vĩ1",28));
        customers.add(new Customer(4,"vĩ4",28));
        customers.add(new Customer(3,"vĩ3",28));
        customers.add(new Customer(2,"vĩ2",24));
        System.out.println(customers);
        // tại thơì điểm nay tôi muốn sắp xếp theo tuổi và tên
        Collections.sort(customers);
        System.out.println("-----------sau khi sắp xếp theo tuổi và tên-----------");
        System.out.println(customers);
        // Bầy gio tôi lại muôn sắpxeepsp theo id???

        Collections.sort(customers,new CompById());
        System.out.println("----------------sau khi sắp xếp theo id");
        System.out.println(customers);
        System.out.println("------sắp xếp theo tên--------------");
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return 0;
            }
        });
    }
}
