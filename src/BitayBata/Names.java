/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitayBata;

/**
 *
 * @author Admin
 */
public class Names {
         static String[] words = {"Mery-an", "Joshua", "Kerwien", "Junmar", "Pael", "Maria", "Leshlie","Christine","Dexter","Jesselle","Melchor","Chymbee","Juan","Joselito","Restituto","Marjory","Elizabeth" };
         static int rand =(int) (Math.random() * words.length);
         static String[] hint = {"She is friendly!", "He is the class reps!", "He is humble and willing to help. ", "He is small but terrible!", "He is bansay mo code!", "She is 'tamsy'!","She is our pambato in terms of pageant!","She is cute and talented.","Our papang.", "Our mommy!", "Gwapo nga chicksboy.","The princess type girl","He is moreno!","He is frank.","He is chubby but handsome.", "She is beauitful!", "She is gifted." }; 
	 static String word = words[rand].toUpperCase();
	 static String underscore = new String(new char[word.length()]).replace("\0", "_");
}
