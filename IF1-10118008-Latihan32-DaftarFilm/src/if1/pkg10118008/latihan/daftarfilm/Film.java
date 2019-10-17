/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan.daftarfilm;

/**
 *
 * @author ASUS
 */
public class Film {
	
	String filmName;
	String filmGenre;
	double filmRating;
	int filmDuration;
	
	public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration){
		this.filmName = filmName;
		this.filmGenre = filmGenre;
		this.filmRating= filmRating;
		this.filmDuration = filmDuration;
		
		
		System.out.println("Judul Film : " + filmName);
		System.out.println("Genre Film : " + filmGenre);
		System.out.println("Rating Film : " + filmRating);
		System.out.println("Duration Film : " + filmDuration  + " Menit\n");
	}
	
}
