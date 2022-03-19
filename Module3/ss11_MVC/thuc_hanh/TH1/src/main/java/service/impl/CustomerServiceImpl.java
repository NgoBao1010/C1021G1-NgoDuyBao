package service.impl;

import model.Customer;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private static Map<Integer,Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1,new Customer(1,"LINH DL","dangduylinh@gmail.com","192/68 Tô Hiệu"));
        customerMap.put(2,new Customer(2,"HOÀNG NA","nguyenanhhoang@gmail.com","07 Ngô Chơn Liêu"));
        customerMap.put(3,new Customer(3,"THUẬN PD","duythuan@gmail.com","07 Hà Huy Tập"));
        customerMap.put(4,new Customer(4,"HIẾU HN","nhathieuthichdanong@gmail.com","Hội An"));
        customerMap.put(5,new Customer(5,"ĐẠT 09","dat09@gmail.com","195 Phước Lý"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
