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
        
        int monat = 6;
        int[] zwischenwerte = new int [20];
        zwischenwerte[0]=0;
        zwischenwerte[1]=1;
        zwischenwerte[2]=1;
        for(int i = 3; i <=monat;i++){
            zwischenwerte[i]= zwischenwerte[i-1] + zwischenwerte [i-2];
           }
        System.out.println(zwischenwerte[monat]);
        ///System.out.println(population(monat));
    }
    
    public static int population(int m){
        if(m<=0){
            return 0;
        }else if(0<m && m<=2){
            return 1;
        }else{
            return population(m-1) + population(m-2);
        }
    }
}
