package Aufgabe3; // Package erstellt - src rechte Maustaste...

import javax.naming.Name;

public class Aufgabe3
{
    public static void main(String[] args) // es wurde eine Main-Methode gewünscht
    {
        String name = "Sabrina"; // wir mussten bei Aufgabe 3, eine Variable - STRING mit unserem Namen erstellen
        System.out.println(name); // sout gibt den Namen aus
        int alter = 25; // wir mussten eine Variable - INT mit unserem Alter erstellen
        System.out.println((alter)); // sout gibt uns das Alter aus
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol"; //rechte Maustaste - Refactor - Rename und neu eingeben
        // final bedeutet das die ganze Zeile Final geändert wurde, es benötigt als erstes Wort inder Zeile final und dann muss der Variablenname in Grossbuchstaben geschrieben werden
        final String hallo; // bei Aufgabe 5 wurde uns die Autovervollständigung vorgestellt,  fi strg+leertaste und es werden uns mehrere Variablen vorgeschlagen
        String anweisung = "JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen\nwie 'c' um einzelne Zeichen zu definieren.";
        System.out.println(anweisung);
        // bei Übung 6 wurde uns der backslash vorgestellt mit dem man Anführungszeichen bei Ausgaben sieht, und \n ist ein Zeilenumbruch
        String anweisung2 = "Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\";
        System.out.println(anweisung2);
        // macht man zwei Backslash wird uns in der Ausgabe nur noch ein Backslash gezeigt 2=1 Backslash
        String anweisung3 = "Ich verwende den \b Backspace, die Newline \n und den \tTabulator";
        System.out.println(anweisung3);
        // \n = nächste Zeile, \t= Tabulator;
        String anweisung4 = "Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "diebestehendeZeile.\\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt.";
        System.out.println(anweisung4);
        // \r=überschreibt die bestehende Zeile
    }

}
