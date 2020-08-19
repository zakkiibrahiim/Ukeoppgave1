public class Oppg3 {
//1.1.4
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

        public static void main(String[] args){

            int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
            int m = maks(a);
            System.out.println(m);


        /* Oppgave i)
        10, 5, 7, 2, 9, 1, 3, 8, 4, 6

        antall tall_n = 10, antall ganger større_x = 0, tilsammen 42
        --> Gir antall operasjoner lik 42

        Oppgave ii)

        1,2,3,4,5,6,7,8,9,10

        antall tall_n = 10, antall ganger større_x = 9, tilsammen 69
        --> Gir antall operasjoner lik 69
         */

        // PGA: Regnskapet blir nå 1 + 2 + 1 + n + n−1 + 2(n−1) + 3x + 1
            // = 4n + 2 + 3x der x er antallet ganger
            // sammenligningen a[i] > maksverdi er sann.
        }
    }
