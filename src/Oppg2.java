public class Oppg2 {

    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
            else if (verdi < minverdi) {minverdi = verdi; mi = i;}
        }

        return new int[]{mi,ma};
    }


    //Oppgaver 1.1.3
    public static void main(String [] args){

        int[] a = {1, 8};


        System.out.println(minmaks(a));

         /*
        int[] a = {1,8};

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

}
