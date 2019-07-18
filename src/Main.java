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
        // 1 | Juni    | 8
        // Die Forscher gehen davon aus, dass hinter dieser Beobachtung 
        // folgende Formel steckt:
        // p(m) = 0              wenn  m <= 0
        // p(m) = 1              wenn 0 < m <= 2
        // p(m) = p*(m-1)*(m-2)  sonst
        
        int monat = 2;
        System.out.println(population(monat));
    }
    
    public static int population(int m){
        return 0;
    }
}
