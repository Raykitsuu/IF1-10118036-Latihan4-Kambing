/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author
 * NAMA			: Adrian C. Senna
 * KELAS		: IF-1
 * NIM			: 10118036
 * Deskripsi Program	: Program ini berisi program untuk menampilkan jumlah kambing dari kelas mamalia
 */
public class Latihan4 {

	public void tambahKambing(){
		int jumlahKambing = 0;
		jumlahKambing = jumlahKambing + 5;
		System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
	}
	public static void main(String[] args) {
		Latihan4 kambingJantan = new Latihan4();
		kambingJantan.tambahKambing();
	}
	
}
