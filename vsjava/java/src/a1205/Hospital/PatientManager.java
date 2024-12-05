package a1205.Hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager {
    private static ArrayList<Patient> patients; // 환자목록
    Scanner sc = new Scanner(System.in);
    public String hospital = "#     #    " + " ###     " + " ####     " + "#####    " + "#####    " + "#####      " + "#        " + "#\n"
                            +"#     #    " + "#   #    " + "#         " + "#   #    " + "  #      " + "  #       " + "# #       " + "#\n"
                            +"#######    " + "#   #    " + "#####     " + "#####    " + "  #      " + "  #      " + "#####      " + "#\n"
                            +"#     #    " + "#   #    " + "    #     " + "#        " + "  #      " + "  #     " + "#     #     " + "#\n"
                            +"#     #    " + " ###     " + "####      " + "#        " + "#####    " + "  #    " + "#       #    " + "#####\n";
    public PatientManager(){
        patients = new ArrayList<>();
        patients.add(new Patient("홍길동", "010-1234-1234", "경기도 성남시", "치과", "12:30"));
        // 더미데이터를 PatientManager() 객체가 생성되면 한개 넣기
    }
    public void patientAppointment() {
        System.out.println("==========환자 등록==========");
        System.out.print("이름 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("전화번호(-포함): ");
        String phone = sc.next();
        sc.nextLine();
        System.out.print("주소: ");
        String address = sc.nextLine();
        System.out.print("진료 내용: ");
        String disease = sc.next();
        sc.nextLine();
        System.out.print("예약 시간: ");
        String time = sc.next();
        sc.nextLine();
        patients.add(new Patient(name, phone, address, disease, time));
        System.out.println("접수중입니다.");
        System.out.println("\n" + name + "님, 진료가 접수되었습니다.");

    }
    public void patientPrint() {
        boolean patientAppoint = false;
        System.out.print("등록된 정보를 보고 싶은 환자의 이름 : ");
        String name = sc.next();
        for(Patient list : patients){
            if(list.getName().equalsIgnoreCase(name)){
                patientAppoint = true;
                System.out.println("등록정보 : " + list.getDisease() + " " + list.getTime());
            }
        }
        if(!patientAppoint){
            System.out.println("정보가 존재하지 않습니다.");
            return;
        }
    }
    public void adminMenu() { // 비밀번호 확인을 통과한 관리자 메뉴
        while (true) {
            System.out.println("\n======= 관리자 메뉴 =======\n");
            System.out.println("1. 환자 등록 목록");
            System.out.println("2. 환자 등록 삭제");
            System.out.println("3. 환자 정보 수정");
            System.out.println("4. 메인으로 돌아가기\n");
            System.out.print("입력 > ");
            
            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    printAll(); // 모든 환자 조회
                    break;
                case 2:
                    cancelAppoint(); // 환자등록삭제
                    break;
                case 3:
                    updatePatient(); // 환자 등록된 정보 수정
                    break;
                case 4:
                    return;
                    // 메인메뉴에서 3번을 선택하면 adminMenu() 실행
                    // 4를 선택하면 return을 통해 adminMenu()의 실행을 종료하고
                    // 호출된 위치(메인메뉴)로 돌아온다
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하십시오.");
                    break;
            }
        }
    }

    private void updatePatient() {
        boolean patientFound = false;
        System.out.print("정보를 수정할 환자이름 : ");
        String name = sc.next();
        for(Patient list : patients){
            if(list.getName().equals(name)){
                System.out.println("수정하고싶은 정보를 선택하세요");
                System.out.println("1.전화번호 | 2.주소 | 3.예약시간");
                System.out.print("입력 >>");
                String updateNum = sc.next();
                if(list.getName().equals(1)){
                    System.out.print("전화번호 수정 >> ");
                    String updatePhone = sc.next();
                    list.setPhone(updatePhone);
                    System.out.println(name + "님의 전화번호가 수정되었습니다.");
                    break;
                }else if(updateNum.equals("2")){
                    System.out.print("주소 수정 >> ");
                    String updateAddress = sc.next();
                    list.setAddress(updateAddress);
                    System.out.println(name + "님의 주소가 수정되었습니다.");
                    break;
                }else if(updateNum.equals("3")){
                    System.out.print("예약시간 수정 >> ");
                    String updateTime = sc.next();
                    list.setTime(updateTime);
                    System.out.println(name + "님의 예약시간이 수정되었습니다.");
                    break;
                }else{
                    System.out.println("잘못 입력했습니다.");
                    break;
                }
            }
        } 
        if(!patientFound){
            System.out.println("존재하지 않습니다.");
        }
    }

    private void cancelAppoint() {
        System.out.print("정보를 삭제하고 싶은 환자 이름을 입력하세요 : ");
        String cancelName = sc.next();
        boolean patientFound = false;
        for (Patient patient : patients) {
            if(patient.getName().equalsIgnoreCase(cancelName)){
                patients.remove(patient);
                System.out.println("삭제중입니다.");
                System.out.println("\n" + cancelName + "님의 정보가 삭제되었습니다.");
                patientFound = true;
                break;
            }
        }
        if(!patientFound){
            System.out.println("환자가 존재하지 않습니다.");
        }
    }

    private void printAll() {
        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
        if(patients.isEmpty()){ // patients가 isEmpty() 리스트가 비어있으면
            System.out.println("환자가 존재하지 않습니다.");
            return;
        }
    }
}
