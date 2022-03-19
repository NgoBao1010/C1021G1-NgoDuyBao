package De_C09.Service.Impl;

import De_C09.Model.AuthMobile;
import De_C09.Model.HandedMobile;
import De_C09.Model.Mobile;
import De_C09.Service.IMobileService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileServiceImpl implements IMobileService {
    private List<Mobile> mobileList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public String[] create(){
        System.out.print("Nhập tên điện thoại: ");
        String mobileName = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantily = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String brand = scanner.nextLine();
        String[] arrCreate = {mobileName, String.valueOf(price), String.valueOf(quantily),brand};
        return arrCreate;
    }
    @Override
    public void addNew(int num) {
        if (num == 1){
            String[] arr = create();
            int thoiHanBaoHanh = 0;
            String phamViBaoHanh;
            boolean check;

            do {
                check = false;
                try {
                    System.out.print("Nhập thời gian bảo hành: ");
                    thoiHanBaoHanh = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Nhập số thôi bạn yêu...");
                    check = true;
                    continue;
                }catch (Exception e){
                    e.getMessage();
                    check = true;
                    continue;
                }
                if (thoiHanBaoHanh > 730){
                    System.out.println("Bảo hành gì lâu dữ zậy cha, trong vòng 2 năm thôi.");
                    check = true;
                    continue;
                }
            }while (check);

            do {
                check = true;
                System.out.print("Nhập phạm vi bảo hành vào đây: ");
                phamViBaoHanh = scanner.nextLine();
                if (phamViBaoHanh.toLowerCase().equals("toàn quốc") || phamViBaoHanh.toLowerCase().equals("quốc tế")){
                    check = false;
                    break;
                }
                if (check){
                    System.out.println("Vui lòng nhập phạm vi bảo hành gồm (toàn quốc hoặc quốc tế), hãy là người dùng thông minh nha baby.");
                }
            }while (check);

            AuthMobile authMobile = new AuthMobile(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),arr[3],thoiHanBaoHanh,phamViBaoHanh);
            mobileList.add(authMobile);

        }else if(num == 2){
            String[] arr = create();
            String quocGiaXachTay;
            String status;
            boolean check;
            do {
                check = false;
                System.out.print("Nhập quốc gia xách tay: ");
                quocGiaXachTay = scanner.nextLine();
                if (quocGiaXachTay.toLowerCase().equals("việt nam")){
                    System.out.println("Sao lại xách tay ở Việt Nam zậy ba.");
                    check = true;
                    continue;
                }
            }while (check);
            do {
                check = true;
                System.out.println("Nhập tình trạng máy vào đây: ");
                status = scanner.nextLine();
                if (status.toLowerCase().equals("đã sữa chữa") || status.toLowerCase().equals("chưa sửa chữa")){
                    check = false;
                    break;
                }
                if (check){
                    System.out.println("Vui lòng nhập (đã sửa chữa hoặc chưa sửa chữa),hãy là người dùng thông minh.");
                }
            }while (check);

            HandedMobile handedMobile = new HandedMobile(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),arr[3],quocGiaXachTay,status);
            mobileList.add(handedMobile);

        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void listMobile() {
        for (Mobile mobile : mobileList){
            System.out.println(mobile);
        }
    }

    @Override
    public void search() {

    }
}
