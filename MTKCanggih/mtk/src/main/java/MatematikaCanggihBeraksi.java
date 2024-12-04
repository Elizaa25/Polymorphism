/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    
    public static void main(String[] args){
        MatematikaCanggih call = new MatematikaCanggih();
        call.pertambahan(20, 20);
        System.out.println("pertambahan 20 + 20 =" + call.operasi);
        call.pertambahan(20, 20, 22);
        System.out.println("pertambahan 20 + 20 + 22 =" + call.operasi);
        call.pertambahan(2.0, 2.0);
        System.out.println("pertambahan 2.0 + 2.0 + 2.2 =" + call.operasiDouble);
        call.pertambahan(2.0, 2.0, 2.2);
        System.out.println("pertambahan 2.0 + 2.0 + 2.2 =" + call.operasiDouble);
       
        call.pengurangan(10, 20);
        System.out.println("pengurangan 10 - 20 =" + call.operasi);
        call.pengurangan(10, 20, 16);
        System.out.println("pengurangan 10 - 20 - 16 =" + call.operasi);
        call.pengurangan(1.0, 2.0);   
        System.out.println("pengurangan 1.0 - 2.0 =" + call.operasiDouble);
        call.pengurangan(1.0, 2.0, 1.6);   
        System.out.println("pengurangan 1.0 - 2.0 - 1.6 =" + call.operasiDouble);
         
        call.pembagian (10, 20);
        System.out.println("pembagian 10 / 20 =" + call.operasi);
        call.pembagian (10, 20, 14);
        System.out.println("pembagian 10 / 20 / 14 =" + call.operasi);
        call.pembagian (1.0, 2.0);
        System.out.println("pembagian 1.0 / 2.0 =" + call.operasiDouble);
        call.pembagian (1.0, 2.0, 1.4);
        System.out.println("pembagian 1.0 / 2.0 / 1.4 =" + call.operasiDouble);
        
        call.perkalian(10, 20);
        System.out.println("perkalian 10 * 20 =" + call.operasi);
        call.perkalian(10, 20, 12);
        System.out.println("perkalian 10 * 20 * 12 =" + call.operasi);
        call.perkalian(1.0, 2.0);
        System.out.println("perkalian 1.0 * 2.0 =" + call.operasiDouble);
        call.perkalian(1.0, 2.0, 1.2);
        System.out.println("perkalian 1.0 * 2.0 * 1.2 =" + call.operasiDouble);
        
        call.modulus (17 , 32);
        System.out.println("modulus 17 % 32 =" + call.x);
        call.modulus (17 , 32 , 20);
        System.out.println("modulus 17 % 32 % 20 =" + call.x);
        call.modulus (1.7, 3.2);
        System.out.println("modulus 1.7 % 3.2 =" + call.y);
        call.modulus (1.7, 3.2, 2.0);
        System.out.println("modulus 1.7 % 3.2 % 2.0 =" + call.y);
    }
}