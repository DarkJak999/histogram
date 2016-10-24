package org.academiadecodigo.histogram;

/**
 * Created by codecadet on 21/10/16.
 */
public class HistogramTester {

    public static void main(String[] args) {

        String text = "House House House Dog Dog Dog Dog Bam Bam Test Test";
        NaughtyText naughtyText = new NaughtyText();
        Histogram histo = new Histogram();
        Histogram histo2 = new Histogram();

        histo.populateMap(text);
        histo.printMap();

        histo2.populateOP(naughtyText.getText());
        histo2.printMap();
        //estive aqui
    }
}
