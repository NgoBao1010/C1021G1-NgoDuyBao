package Case_Study.Service.Impl;


import Case_Study.Model.FacilityFurama.Facility;
import Case_Study.Model.FacilityFurama.HouseType;
import Case_Study.Model.FacilityFurama.RoomType;
import Case_Study.Model.FacilityFurama.VillaType;
import Case_Study.Service.IFacilityService;

import java.io.*;
import java.util.*;


public class FacilityServiceImpl implements IFacilityService {
    public static final String VILLA_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Case_Study\\Data\\Villa.csv";
    public static final String ROOM_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Case_Study\\Data\\Room.csv";
    public static final String HOUSE_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Case_Study\\Data\\House.csv";
    public static Map<Facility,Integer> facilityListMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    static {
        readFile();
    }

    public static void readFile() {
        for (RoomType entry: readRoom()){
            facilityListMap.put(entry,1);
        }
        for (VillaType entry: readVilla()){
            facilityListMap.put(entry,1);
        }
        for (HouseType entry: readHouse()){
            facilityListMap.put(entry,1);
        }
    }

    public FacilityServiceImpl() {
        readFile();
    }

    @Override
    public void listMaintenance() {
        for (Map.Entry<Facility,Integer> entry: facilityListMap.entrySet()){
            if (entry.getValue() > 4){
                System.out.println("Cần bảo trì rồi bạn êi...");
            }else {
                System.out.println("Mới xài có vài lần mà bảo trì cái gì...");
            }
        }
    }

    public void displayVilla(){

            for (Map.Entry<Facility,Integer>facilityIntegerEntry: facilityListMap.entrySet()){
                if(facilityIntegerEntry.getKey() instanceof VillaType){
                    System.out.println(facilityIntegerEntry.getKey());
                    System.out.println(facilityIntegerEntry.getValue());
                }
            }
    }
    public void displayHouse(){

            for (Map.Entry<Facility,Integer>facilityIntegerEntry: facilityListMap.entrySet()){
                if(facilityIntegerEntry.getKey() instanceof HouseType){
                    System.out.println(facilityIntegerEntry.getKey());
                    System.out.println(facilityIntegerEntry.getValue());
                }
            }

    }
    public void displayRoom(){

            for (Map.Entry<Facility,Integer>facilityIntegerEntry: facilityListMap.entrySet()){
                if(facilityIntegerEntry.getKey() instanceof RoomType){
                    System.out.println(facilityIntegerEntry.getKey());
                    System.out.println(facilityIntegerEntry.getValue());
                }
            }

    }
    public static int random(){
        int code = (int) Math.floor(((Math.random() * 25) + 65));
        return code;
    }
    public static String randomNum(){
        String result = "";
        for (int i = 0; i < 4;i++){
            int num = random();
            result += num;
        }
        return result;
    }
    @Override
    public void add(int num) {
        if(num == 1){
            String[] arr = create();
            double poolArea = 0;
            boolean check;
            int quantityOfFloor = 0;
            System.out.print("Input room standard (studio,twin,single): ");
            String roomStandard = scanner.nextLine();
            do {
                check = false;
                try {
                    System.out.print("Input Pool Area (m2): ");
                    poolArea = Double.parseDouble(scanner.nextLine());

                }catch (NumberFormatException e){
                    System.out.print("Please input number.");
                    check = true;
                    continue;
                }catch (Exception e){
                    e.getMessage();
                    check = true;
                    continue;
                }
                if (poolArea < 30){
                    System.out.print("Pool area must be more than 30. ");
                    check = true;
                }
            }while (check);


            do {
                check = false;
                try {
                    System.out.print("Input Quantity Of Floor: ");
                    quantityOfFloor = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Please input number.");
                    check = true;
                }catch (Exception e){
                    e.getMessage();
                    check = true;
                }
                if (quantityOfFloor < 0){
                    System.out.println("Please input integer number.");
                    check = true;
                }
            }while (check);


            VillaType villa = new VillaType("SVVL-" + randomNum(),"Villa",Double.parseDouble(arr[0]),Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),arr[3],roomStandard,poolArea,quantityOfFloor);

            updateNumUser(villa);
            writeVilla();


        }else if(num == 2){
            String[] arr = create();
            boolean check;
            int quantityOfFloor = 0;

            System.out.print("Input room standard (studio,twin,single): ");
            String roomStandard = scanner.nextLine();
            do {
                check = false;
                try {
                    System.out.print("Input Quantity Of Floor: ");
                    quantityOfFloor = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Please input number.");
                    check = true;
                }catch (Exception e){
                    e.getMessage();
                    check = true;
                }
                if (quantityOfFloor < 0){
                    System.out.println("Please input integer number.");
                    check = true;
                }
            }while (check);

            HouseType house = new HouseType("SVHO-" + randomNum(),"House",Double.parseDouble(arr[0]),Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),arr[3],roomStandard,quantityOfFloor);

            updateNumUser(house);
            writeHouse();

        }else if(num == 3){
            String[] arr = create();

            System.out.print("Input Free Service (water,tea,noodle): ");
            String freeService = scanner.nextLine();
            RoomType room = new RoomType("SVRO-" + randomNum(),"Room",Double.parseDouble(arr[0]),Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),arr[3],freeService);
            updateNumUser(room);
            writeRoom();
        }
    }
    public String[] create(){

        double areaUsable = 0;
        int rent = 0;
        int maxPeople = 0;
        String rentType = null;
        boolean check;
        do {
            check = false;
            try {
                System.out.print("Input area room (m2): ");
                areaUsable = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please input number");
                check = true;
                continue;
            }catch (Exception e){
                e.getMessage();
                check = true;
                continue;
            }
            if(areaUsable < 30){
                System.out.print("Area Usable must be more than 30. ");
                check = true;
            }

        }while (check);

        do {
            check = false;
            try {
                System.out.print("Input rent room (USD): ");
                rent = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please input number");
                check = true;
                continue;
            }catch (Exception e){
                e.getMessage();
                check = true;
                continue;
            }
            if(rent < 0){
                System.out.print("Rent must be a positive number.");
                check = true;
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.print("Input max guest: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please input number");
                check = true;
                continue;
            }catch (Exception e){
                e.getMessage();
                check = true;
                continue;
            }
            if(maxPeople < 0 || maxPeople > 20){
                System.out.print("The maximum number of people must be greater than 0 and less than 20");
                check = true;
            }
        }while (check);
        do {
            check = true;
                System.out.print("Input rent type: ");
                rentType = scanner.nextLine();
                if ((rentType.toLowerCase().equals("hour")) || (rentType.toLowerCase().equals("day")) ||
                        (rentType.toLowerCase().equals("month")) || (rentType.toLowerCase().equals("year"))){
                    check = false;
                    break;
                }
                if(check){
                    System.out.println("input only (hour/day/month/year)");
                }
        }while (check);
        

        String[] arrFacility = {String.valueOf(areaUsable), String.valueOf(rent), String.valueOf(maxPeople),rentType};
        return arrFacility;
    }
    public static void writeHouse(){
        File file = new File(HOUSE_CSV);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<Facility,Integer> facility : facilityListMap.entrySet()){
                if (facility.getKey() instanceof HouseType){
                    HouseType house = (HouseType) facility.getKey();
                    bufferedWriter.write(house.getIdService() + "," + house.getServiceName() + "," + house.getAreaUsable() + "," +
                            house.getRent() + "," + house.getMaxPeople() + "," + house.getRentType() + "," + house.getRoomStandard() + "," + house.getQuantityOfFloor());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<HouseType> readHouse(){
        List<HouseType> houseTypeList = new ArrayList<>();
        File file = new File(HOUSE_CSV);
        HouseType houseType = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                houseType = new HouseType(arrData[0],arrData[1],Double.parseDouble(arrData[2]),Integer.parseInt(arrData[3]),
                        Integer.parseInt(arrData[4]),arrData[5],arrData[6], Integer.parseInt(arrData[7]));

            }
            if (houseType != null){
                houseTypeList.add(houseType);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseTypeList;
    }

    public static void writeVilla(){
        File file = new File(VILLA_CSV);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<Facility,Integer> facility : facilityListMap.entrySet()){
                if (facility.getKey() instanceof VillaType){
                    VillaType villaType = (VillaType) facility.getKey();
                    bufferedWriter.write(villaType.getIdService() + "," + villaType.getServiceName() + "," + villaType.getAreaUsable() + "," +
                            villaType.getRent() + "," + villaType.getMaxPeople() + "," + villaType.getRentType() + "," + villaType.getRoomStandard() + "," +
                            villaType.getPoolArea() + "," + villaType.getQuantityOfFloor());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<VillaType> readVilla(){
        List<VillaType> villaTypeList = new ArrayList<>();
        File file = new File(VILLA_CSV);
        VillaType villaType = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                villaType = new VillaType(arrData[0],arrData[1],Double.parseDouble(arrData[2]),Integer.parseInt(arrData[3]),Integer.parseInt(arrData[4]),arrData[5],arrData[6],
                        Double.parseDouble(arrData[7]),Integer.parseInt(arrData[8]));
            }
            if (villaType != null){
                villaTypeList.add(villaType);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaTypeList;
    }

    public static void writeRoom(){
        File file = new File(ROOM_CSV);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<Facility,Integer> facility : facilityListMap.entrySet()){
                if (facility.getKey() instanceof RoomType){
                    RoomType room = (RoomType) facility.getKey();
                    bufferedWriter.write(room.getIdService() + "," + room.getServiceName() + "," + room.getAreaUsable() + "," +
                            room.getRent() + "," + room.getMaxPeople() + "," + room.getRentType() + "," + room.getFreeService());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<RoomType> readRoom(){
        List<RoomType> roomTypeList = new ArrayList<>();
        File file = new File(ROOM_CSV);
        RoomType roomType = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                roomType = new RoomType(arrData[0],arrData[1],Double.parseDouble(arrData[2]),
                        Integer.parseInt(arrData[3]),Integer.parseInt(arrData[4]),arrData[5],arrData[6]);

            }
            if (roomType != null){
                roomTypeList.add(roomType);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomTypeList;
    }
    public void updateNumUser(Facility facility){
        if(facilityListMap.containsKey(facility)){
            facilityListMap.put(facility, facilityListMap.get(facility) + 1);
        }else {
            facilityListMap.put(facility,1);

        }
    }
}
