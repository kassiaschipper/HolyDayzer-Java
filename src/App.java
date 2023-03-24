import javax.print.attribute.DateTimeSyntax;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       HolyDyzer app = new HolyDyzer();
      
       Scanner in = new Scanner(System.in);
       System.out.println("Digite uma data no formato dd/mm/2023 para verificar se é feriado:");
   
       String date = in.nextLine();
   
       System.out.println( app.checkHoliday(date));

       app.allHolidays();
          
    }
}
