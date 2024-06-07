/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Saputra
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Logic {

    private String nama, jenis_lapangan, jenis_bola, tanggal;
    private int lama_bermain, total_biaya = 0, harga_lapangan, harga_bola;
    
    private Queue<Object[]> bookingQueue;
    private Stack<Object[]> stack;
    
    public Logic(){
        bookingQueue = new LinkedList<>();
        stack = new Stack<>();
    }
    
    public void tambahBooking(Object[] booking){
        bookingQueue.add(booking);
        System.out.println(bookingQueue);
    }
    
    public void hitungTotalBiaya(){
        total_biaya += harga_lapangan*lama_bermain;
        total_biaya += harga_bola;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_lapangan() {
        return jenis_lapangan;
    }

    public void setJenis_lapangan(String jenis_lapangan) {
        this.jenis_lapangan = jenis_lapangan;
        if(jenis_lapangan.equalsIgnoreCase("SINTETIS")){
            harga_lapangan = 120_000;
        }else if(jenis_lapangan.equalsIgnoreCase("VINYL")){
            harga_lapangan = 100_000;
        }else if(jenis_lapangan.equalsIgnoreCase("PARQUETTE")){
            harga_lapangan = 75_000;
        }else{
            harga_lapangan = 0;
        }
    }

    public String getJenis_bola() {
        return jenis_bola;
    }

    public void setJenis_bola(String jenis_bola) {
        this.jenis_bola = jenis_bola;
        if(jenis_bola.equalsIgnoreCase("PLASTIK")){
            harga_bola = 5_000;
        }else if(jenis_bola.equalsIgnoreCase("BLITER")){
            harga_bola = 20_000;
        }else{
            harga_bola = 0;
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
        System.out.println(tanggal);
    }

    public int getLama_bermain() {
        return lama_bermain;
    }

    public void setLama_bermain(int lama_bermain) {
        this.lama_bermain = lama_bermain;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

}
