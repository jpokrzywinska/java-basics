/**
 * Created by jpokr on 2017-03-29.
 */
public class TestTablic {
    public static void main(String[] args) {


        int[] indeks = new int[4];
        indeks[0] = 1;
        indeks[1] = 3;
        indeks[2] = 0;
        indeks[3] = 2;
        String[] wyspy = new String[4];
        wyspy[0] = "Bermudy";
        wyspy[1] = "Fiji";
        wyspy[2] = "Azory";
        wyspy[3] = "Kozumel";
        int y = 0;
        int ref;
        while (y < 4) {
            ref = indeks[y];
            System.out.print("wyspa = ");
            System.out.println(wyspy[ref]);
            y = y + 1;
        }
        for (int i : indeks) { // for each i=0;i<length;i++
            System.out.println(i);
        }
        for (String wyspa : wyspy) { // pierwszy argument to obiekt typu tablica, a drugi to tablica przeszukiwana(kolekcja)
            System.out.println(wyspa);
        }
    }

}

