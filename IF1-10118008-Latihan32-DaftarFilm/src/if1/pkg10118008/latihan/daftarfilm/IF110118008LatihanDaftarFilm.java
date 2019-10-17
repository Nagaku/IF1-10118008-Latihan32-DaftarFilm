/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan.daftarfilm;

/**
 *
 * * @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: Menampilkan daftar film dengan genre
 */
public class IF110118008LatihanDaftarFilm {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		Film film = new Film();
		Film film1 = new Film();
		Film film2 = new Film();
		Film film3 = new Film();
		
		System.out.println("===Daftar Film Sedang Tayang=== \n");
		film.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120 );
		film1.nowPlaying("Small Foot", "Animation", 9.0, 96);
		film2.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
		film3.nowPlaying("Asih", "Horror", 6.0, 100);
	}
	
}
