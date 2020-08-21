public class Oppg2 {
    //Oppgaver 1.1.3
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19, 1};

        int[] minmaks = minmaks(a);


        System.out.println(minmaks);

    }

    //Oppg 5
    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 0; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) {
                maksverdi = verdi;
                ma = i;}
            else if (verdi < minverdi) {
                minverdi = verdi;
                mi = i;}
        }

        return new int[]{mi,ma};
    }
/*


    //Oppg 6
    public static long fak(int n){
        if (n < 0)
            throw new IllegalArgumentException("n > 0");
        long fak = 1;

        for (int i = 2; i <= n; i++) fak *= i;
        return fak;
    }
    // Hvis n = 0 eller 1 utføres ingen multiplikasjoner.
    // HVis n > 1 utføres det n-1 multiplikasjoner.
 */

}
