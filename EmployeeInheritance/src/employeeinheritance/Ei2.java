package employeeinheritance;
import java.util.Scanner;
public class Ei2{
    Scanner ei2 = new Scanner(System.in);
    int nip;
    String namae;
    boolean bitches;
    int salary=3000000;
    int bonus=10000000;
    int cut=100000;
    int workTime;
    int overTime=1000000;


    public int totalSalary(){
        System.out.println("Masukkan Sandi untuk melihat gaji anda: ");
        int pw = ei2.nextInt();
        switch (pw){ 
            case 1:
        salary +=17500000;
            case 2:
        salary +=500000;

        
        System.out.println("Waktu kerja: "+workTime); 
        if (workTime<8) {
            salary-=cut;
            System.out.println("Potongan gaji: "+cut);
        }
        else if(workTime>12){
            salary+=overTime;
            System.out.println("bonus lembur: "+overTime);
        }
        if (bitches==true) {
            salary+=bonus;
            System.out.println("Bonus menikah: "+bonus);
        }
        System.out.println("Total gaji: "+salary);
        return salary;    
    }
    return salary;
}
    

    public void personalData(){
            System.out.println("NIP: "+nip);
            System.out.println("Nama:  "+namae);
            if (bitches==true) {
                System.out.println("Status: Sudah Menikah");
            }
            if (bitches==false) {
                System.out.println("Status: Sek Lajang");
            }
        }
    
    public void absensi(int pil){
        System.out.println("Kehadiran hari ini: \n1. Hadir \n2. Absen");
        pil = ei2.nextInt();
        if (pil==1) {
            System.out.println("Aku Hadir");
        }
        else if (pil==2) {
            System.out.println("Aku absen:<");
        }
    }
}
