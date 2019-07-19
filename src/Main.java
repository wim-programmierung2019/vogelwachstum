public class Main {
    
    /**
     * Einstieg in ein Javaprogramm.
     */
    public static void main(String[] args){
        // Im Indischen Ozean wurde eine insel entdeck, auf der sich eine 
        // bis dahin nicht bekannte Vogelart rasant vermehrt. Forscher
        // haben im Januar ihr Arbeit gestartet und folgende Beobachtung
        // gemacht:
        // m | Monat   | Population
        // 1 | Januar  | 1
        // 2 | Februar | 1
        // 3 | März    | 2
        // 4 | April   | 3
        // 5 | Mai     | 5
        // 6 | Juni    | 8
        // Die Forscher gehen davon aus, dass hinter dieser Beobachtung 
        // folgende Formel steckt:
        // p(m) = 0              wenn  m <= 0
        // p(m) = 1              wenn 0 < m <= 2
        // p(m) = p(m-1)+p(m-2)  sonst
        
        int monat = 23;
        
        // Mit einem Arry und einer Schleife! 
        int[] zwischenwerte = new int[24];
        zwischenwerte[0] = 0;
        zwischenwerte[1] = 1;
        zwischenwerte[2] = 1;

        for(int i= 3; i <= monat; i++){
            zwischenwerte[i]= zwischenwerte[i-1]+ zwischenwerte[i-2];
        }
        System.out.println(zwischenwerte[monat]);
        //System.out.println(population(monat));
    }
    
    /**
    // Rekursive über die Methode 
    public static int population(int m){
       int rueckgabe = 0;
       
       if (m <= 0){
           return rueckgabe;
       }
       else if (m > 0 & m <= 2 )
       {
           rueckgabe= 1;
           return rueckgabe;    
       }
       else {
          rueckgabe= population(m-1) + population(m-2); 
          return rueckgabe;
       }
    }*/
}
