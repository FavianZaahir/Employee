/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeinheritance;
import java.util.Scanner;
public class EmployeeInheritance {    
     public static void main(String[] args) {
         
        Scanner ian = new Scanner(System.in);
        int pilihan;

        cleaningService wa = new cleaningService();
        boss bossu = new boss();
        Ei2 absen = new Ei2();
        System.out.println("Jabatan: \n1. Boss \n2. Cleaning Service");
        pilihan = ian.nextInt();
        switch(pilihan){
            case 1:
                bossu.personalData1();
                break;
            case 2:
                wa.personalData1();    
                break;                
        }
        absen.absensi(0);    
}
}
