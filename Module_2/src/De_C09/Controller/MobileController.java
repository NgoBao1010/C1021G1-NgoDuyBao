package De_C09.Controller;

import De_C09.Service.IMobileService;
import De_C09.Service.Impl.MobileServiceImpl;

import java.util.Scanner;

public class MobileController {
    public static void main(String[] args) {
        IMobileService mobileService = new  MobileServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("--Chương trình quản lí điện thoại--");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                        System.out.println("Bạn muốn thêm mới dòng điện thoại nào (Chính hãng vui lòng nhập 1, xách tay vui lòng nhập 2)");
                        select = Integer.parseInt(scanner.nextLine());
                        if (select == 1){
                            mobileService.addNew(select);
                            break;
                        }
                        if (select == 2){
                            mobileService.addNew(select);
                            break;
                        }
                case 2:
                    mobileService.remove();
                    break;
                case 3:
                    mobileService.listMobile();
                    break;
                case 4:
                    mobileService.search();
                    break;
                case 5:
                    System.out.println("Xin chào và hẹn gặp lại.!!!");
                    break;
                default:
                    System.out.println("Vui lòng nhập trong khoảng từ 1 - 5");
            }
        }while (select != 5);
    }
}
