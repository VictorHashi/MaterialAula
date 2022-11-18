package datas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Datas {

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        
        //Exercicio 1
        /*
        int mes = scan.nextInt();
        int ano = scan.nextInt();
        
        System.out.println(mostraLista(diasDoMesAno(mes,ano)));
        
        */
        
        //Exercicio 2
        int diaIni = scan.nextInt();
        int mesIni = scan.nextInt();
        int anoIni = scan.nextInt();
        
        int diaFim = scan.nextInt();
        int mesFim = scan.nextInt();
        int anoFim = scan.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DATE, diaIni);
        calendario.set(Calendar.MONTH, mesIni);
        calendario.set(Calendar.YEAR, anoIni);
        Date dataIni = calendario.getTime();
        
        calendario.set(Calendar.DATE, diaIni);
        calendario.set(Calendar.MONTH, mesIni);
        calendario.set(Calendar.YEAR, anoIni);
        Date dataFim = calendario.getTime();
        
        
        long dif = calcDifTime(diaIni, diaFim);
        
        
        scan.close();
    
        
    }
    
    
    //Exercicio 1
    public static List<Date> diasDoMesAno(int mes, int ano){
    
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.YEAR, ano);
        
        int qtdDias = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        List<Date> listaDias = new ArrayList<Date>();
        
        for(int x = 1; x <= qtdDias; x++){
            Calendar calendario = Calendar.getInstance();
            calendario.set(Calendar.DATE, x);
            calendario.set(Calendar.MONTH, mes);
            calendario.set(Calendar.YEAR, ano);
            
            Date today = calendario.getTime();
            
            listaDias.add(today);
            
            
        }
        
        
        return listaDias;
    }
    
    public static String mostraLista(List a){
        StringBuilder sb = new StringBuilder();
        
        for(Iterator i = a.iterator(); i.hasNext();){
            sb.append(i.next()+"\n");
        }
        
        return sb.toString();
    }
    
    //Exercicio2
    public static long calcDifTime(Date inicio, Date fim){
        long secIni = inicio.getTime();
        long secFim = fim.getTime();
        
        long dif = (secFim - secIni) / 1000;
        
        return dif;
    }
    
}
