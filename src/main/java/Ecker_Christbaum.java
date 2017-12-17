/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: Christbaum
 * Autoren:     Ecker Quirin
 * Version:     1.0
 * Datum:       17.12.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ausgeben eines Christbaum.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Ausgebung eines Christbaums mit Schleifen.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Christbaum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int treeHeight;
        int treeWidth;
        int floorWidth;
        int numberOfBlanks;

        System.out.print("Baumhöhe: ");
        treeHeight = scanner.nextInt();

        treeWidth = 2 * treeHeight + 1;
        floorWidth = treeWidth + 6;
        numberOfBlanks = floorWidth / 2;

        //Nadeln
        for (int j = 0; j < treeHeight; j++) {
            for (int i = 0; i < numberOfBlanks; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                System.out.print("*");
            }
            numberOfBlanks--;
            System.out.println();
        }

        //Stamm
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < floorWidth / 2;j++){
                System.out.print(" ");
            }
            System.out.println("**");
        }

        //Boden
        for (int i = 0; i < floorWidth; i++){
            System.out.print("*");
        }
    }
}
