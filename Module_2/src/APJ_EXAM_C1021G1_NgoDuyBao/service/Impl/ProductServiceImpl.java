package APJ_EXAM_C1021G1_NgoDuyBao.service.Impl;

import APJ_EXAM_C1021G1_NgoDuyBao.Controller.BusinessController;
import APJ_EXAM_C1021G1_NgoDuyBao.Controller.MainController;
import APJ_EXAM_C1021G1_NgoDuyBao.MyException.MyEx;
import APJ_EXAM_C1021G1_NgoDuyBao.model.NhapKhau;
import APJ_EXAM_C1021G1_NgoDuyBao.model.SanPham;
import APJ_EXAM_C1021G1_NgoDuyBao.model.XuatKhau;
import APJ_EXAM_C1021G1_NgoDuyBao.service.IProductService;
import Thi_Thu.Controller.CodeGymController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    public static final String NHAP_KHAU_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\APJ_EXAM_C1021G1_NgoDuyBao\\data\\nhapKhau.csv";
    public static final String XUAT_KHAU_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\APJ_EXAM_C1021G1_NgoDuyBao\\data\\xuatKhau.csv";
    Scanner scanner = new Scanner(System.in);
    public static List<SanPham> sanPhamList = new ArrayList<>();

    public ProductServiceImpl() {
        readSanPham();
    }

    public String[] thuocTinhChung() {
        boolean check;
        double inputGiaBan = 0;
        int inputSoLuong = 0;

        System.out.println("Vui lòng nhập mã sản phẩm: ");
        String maSanPham = scanner.nextLine();
        System.out.println("Vui lòng nhập tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();
        do {
            check = false;
            try {
                System.out.println("Vui lòng nhập giá bán: ");
                inputGiaBan = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                check = true;
                continue;
            }
            if (inputGiaBan < 0) {
                System.out.println("Lỗi giá sản phẩm nhỏ hơn không. Vui lòng nhập lại!");
                check = true;
                continue;
            }
        } while (check);

        do {
            check = false;
            try {
                System.out.println("Vui lòng nhập số lượng sản phẩm: ");
                inputSoLuong = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                check = true;
                continue;
            }
            if (inputSoLuong < 0) {
                System.out.println("Lỗi số lượng nhỏ hơn không. Vui lòng nhập lại!");
                check = true;
                continue;
            }
        } while (check);

        System.out.println("Vui lòng nhập tên nhà sản xuất: ");
        String inputNhaSanXuat = scanner.nextLine();
        String[] sanPham = {maSanPham,tenSanPham, String.valueOf(inputGiaBan), String.valueOf(inputSoLuong),inputNhaSanXuat};
        return sanPham;
    }
    @Override
    public void addNew(int num) {
        boolean check;
        double giaNhap = 0;
        String tinhThanhNhap = null;
        double thueNhapKhau = 0;
        if (num == 1) {
            String[] sanPham = thuocTinhChung();
            do {
                check = false;
                try {
                    System.out.print("Vui lòng nhập giá nhập khẩu: ");
                    giaNhap = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }
                if (giaNhap < 0) {
                    System.out.println("Lỗi giá nhập nhỏ hơn 0. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }

            } while (check);

                System.out.print("Vui lòng nhập tỉnh thành nhập: ");
                tinhThanhNhap = scanner.nextLine();

            do {
                check = false;
                try {
                    System.out.print("Vui lòng nhập thuế nhập khẩu: ");
                    thueNhapKhau = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }
                if (thueNhapKhau < 0) {
                    System.out.println("Lỗi thuế nhập nhỏ hơn 0. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }

            } while (check);


            NhapKhau nhapKhau = new NhapKhau(sanPham[0], sanPham[1],
                    Double.parseDouble(sanPham[2]), Integer.parseInt(sanPham[3]), sanPham[4], giaNhap,tinhThanhNhap,thueNhapKhau);
            sanPhamList.add(nhapKhau);
            System.out.println("Thêm thành công...");
            writeFile();
        }
        if (num == 2) {
            String[] sanPham = thuocTinhChung();
            double inputGiaXuat = 0;
            String inputQuocGiaNhap = null;
            do {
                check = false;
                try {
                    System.out.print("Vui lòng nhập giá Xuất khẩu: ");
                    inputGiaXuat = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }
                if (inputGiaXuat < 0) {
                    System.out.println("Lỗi giá nhập nhỏ hơn 0. Vui lòng nhập lại!");
                    check = true;
                    continue;
                }

            } while (check);

            System.out.print("Vui lòng nhập Quốc gia nhập khẩu sản phẩm: ");
            inputQuocGiaNhap = scanner.nextLine();

            XuatKhau xuatKhau = new XuatKhau(sanPham[0], sanPham[1],
                    Double.parseDouble(sanPham[2]), Integer.parseInt(sanPham[3]), sanPham[4], inputGiaXuat, inputQuocGiaNhap);
            sanPhamList.add(xuatKhau);
            System.out.println("Thêm thành công...");
            writeFile();
        }

    }

    @Override
    public void delete() {
        boolean check;
        String inputMaSanPham = null;
        check = false;
        System.out.print("Vui lòng nhập mã sản phẩm: ");
        inputMaSanPham = scanner.nextLine();
        boolean checkEx = true;
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getMaSanPham().equals(inputMaSanPham)) {
                checkEx = false;

                do {
                    check = false;
                    System.out.println("Yes or No");
                    String action = scanner.nextLine();

                    if (!action.toLowerCase().equals("yes") && !action.toLowerCase().equals("no")) {
                        System.out.println("Lỗi nhập sai. Vui lòng nhập lại!");
                        check = true;
                        continue;
                    } else if (action.toLowerCase().equals("yes")) {
                        sanPhamList.remove(i);
                        System.out.println("Xóa thành công.");
                        writeFile();
                        break;
                    } else if (action.toLowerCase().equals("no")) {
                        MainController.run();
                    }
                } while (check);
            }
            if (checkEx) {
                try {
                    throw new MyEx();
                } catch (MyEx e) {
                    e.NotFoundProductException();
                }
            }
        }
    }

    public static void writeFile() {
        File nhapKhau = new File(NHAP_KHAU_CSV);
        File xuatKhau = new File(XUAT_KHAU_CSV);
        try {
            FileWriter fileWriterNhapKhau = new FileWriter(nhapKhau);
            FileWriter fileWriterXuatKhau = new FileWriter(xuatKhau);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriterNhapKhau);
            BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriterXuatKhau);
            List<NhapKhau> nhapKhaus = new ArrayList<>();
            List<XuatKhau> xuatKhaus = new ArrayList<>();


            for (NhapKhau nhapKhau1 : nhapKhaus) {
                bufferedWriter.write(nhapKhau1.getId() + "," + nhapKhau1.getMaSanPham() + "," +
                        nhapKhau1.getTenSanPham() + "," + nhapKhau1.getGiaBan() + "," + nhapKhau1.getSoLuong() + "," +
                        nhapKhau1.getNhaSanXuat() + "," + nhapKhau1.getGiaNhap() + "," + nhapKhau1.getTinhThanhNhap() + ","
                        + nhapKhau1.getThueNhapKhau());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

            for (XuatKhau xuatKhau1 : xuatKhaus) {
                bufferedWriter1.write(xuatKhau1.getId() + "," + xuatKhau1.getMaSanPham() + "," +
                        xuatKhau1.getTenSanPham() + "," + xuatKhau1.getGiaBan() + "," + xuatKhau1.getSoLuong() + "," +
                        xuatKhau1.getNhaSanXuat() + "," + xuatKhau1.getGiaXuatKhau() + "," + xuatKhau1.getQuocGiaNhap());
                bufferedWriter1.newLine();
            }
            bufferedWriter1.close();

            for (SanPham sanPham : sanPhamList) {
                if (sanPham instanceof NhapKhau) {
                    nhapKhaus.add((NhapKhau) sanPham);
                } else {
                    xuatKhaus.add((XuatKhau) sanPham);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<SanPham> readFromFileNhapKhau() {
        List<SanPham> nhapKhaus = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(NHAP_KHAU_CSV);
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String temp[];
            NhapKhau nhapKhau;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                nhapKhau = new NhapKhau(temp[1], temp[2], Double.parseDouble(temp[3]),
                        Integer.parseInt(temp[4]), temp[5], Double.parseDouble(temp[6]),temp[7],Double.parseDouble(temp[8]));
                nhapKhau.setId(Integer.parseInt(temp[0]));
                nhapKhaus.add(nhapKhau);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nhapKhaus;
    }
    public static List<SanPham> readFromFileXuatKhau() {
        List<SanPham> xuatKhaus = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(XUAT_KHAU_CSV);
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String temp[];
            XuatKhau xuatKhau;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                xuatKhau = new XuatKhau(temp[1], temp[2], Double.parseDouble(temp[3]),
                        Integer.parseInt(temp[4]), temp[5],Double.parseDouble(temp[6]),temp[7]);
                xuatKhau.setId(Integer.parseInt(temp[0]));
                xuatKhaus.add(xuatKhau);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xuatKhaus;
    }
    public static void readSanPham() {
        for (SanPham sanPham : readFromFileNhapKhau()) {
            sanPhamList.add(sanPham);
        }
        for (SanPham sanPham : readFromFileXuatKhau()) {
            sanPhamList.add(sanPham);
        }
    }
    @Override
    public void display() {
        for (SanPham sanPham : sanPhamList ){
            System.out.println(sanPham);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm.");
        String nameProduct = scanner.nextLine();
        for (int i=0 ; i<sanPhamList.size() ; i++){
            if (sanPhamList.get(i).getTenSanPham().contains(nameProduct)){
                System.out.println(sanPhamList.get(i));
            }
        }
    }
}
