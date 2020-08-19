public class Oppg4 {
//1.1.5
    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0;; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }

    } // maks

    public static void main(String[] args){
        int[] array = {1};
        /*  int Utarray = maks(array);*/
        System.out.println(maks(array));

    }

}

 /*

    - Koden gir riktig svar sånn som den er skrevet i kompendiet.

    - Hvis a er tom, lengde 0, sier vi at det er et "ulovlig" tilfelle.
      (hvis a er tom eller 0).
      (hvis tabellen er tom skal det kastes en NoSuchElementException).
      Med tabell a med ingen elementer (dvs. a.length lik 0),
      der det ikke finnes noe element med indeks lik 0.
      Vil setningen int maksverdi = a[0] gi en ArrayIndexOutOfBoundsException.


    - Hvis a har lengde 1 utføres koden normalt, og vi får 0 som svar på posisjonen til det største tallet.
    Hvis tabellen a kun har ett element, vil for-løkken gå én gang siden sist er 0.
    Dermed returneres 0 som er posisjonen til den største. Hvis det er kun ett element, er det også størst.

     */