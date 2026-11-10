import java.util.Scanner;
import java.net.*;

void main() {

    Scanner teclado = new Scanner(System.in);

   while (true){
       System.out.print("dime el nombre de un dominio o escribe salir:");
       String dominio = teclado.nextLine();


       if (dominio.equals("salir")){
           System.out.println("saliendo......");
           break;
       }else {

           try {
               InetAddress yo = InetAddress.getLocalHost();
               System.out.println("Mi equipo: "+yo.getHostName()+" ip:"+yo.getHostAddress());
               System.out.println("IPv4");

                for(InetAddress ip : InetAddress.getAllByName(dominio)){
                    if (ip instanceof Inet4Address){
                        System.out.println(" "+ ip.getHostAddress());
                    }
                }

               System.out.println("IPv6");
               for(InetAddress ip : InetAddress.getAllByName(dominio)){
                   if (ip instanceof Inet6Address){
                       System.out.println(" "+ ip.getHostAddress());
                   }

               }


           } catch (UnknownHostException  e) {
               System.out.println("Dominio inexistente " + e.getMessage());
           }











       }





   }



}
