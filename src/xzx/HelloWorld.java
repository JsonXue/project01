package xzx;

import javabeen.Customer;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello word");
    System.out.print("你好:");
    Integer id = get().getId();
    System.out.print(get().getName());
  }

  public static Customer get() {
    Customer customer = new Customer();
    customer.setId(1);
    customer.setName("xzx");
    customer.setSex("男");
    return customer;
  }
}
