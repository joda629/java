import javax.swing.*;
import java.util.Scanner;

public class services
{
    public static void main(String[] args)
    {

        String name,lastname,address;
        int range,option;
        float iva5=0.05F,iva10=0.10F,iva15=0.15F,agua,gas,energia,total,subtotal,temp=0F;
        Scanner ins = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║              PAGAR SERVICIOS             ║");
        System.out.println("╚══════════════════════════════════════════╝ ");
        System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╍");
        System.out.println(".:Porfavor ingrese sus datos personales:.");
        System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍");
        System.out.print(".:Ingrese su Nombre: ");;
        name=ins.nextLine();
        System.out.print(".:Ingrese su apellido: ");
        lastname=ins.nextLine();
        System.out.print("Ingrese la dirección de su hogar: ");
        address=ins.nextLine();
        System.out.print(".:Ingrese el estrato de su hogar: ");;
        range=ins.nextInt();
           while(range <  1 || range > 3 )
            {
                System.out.println(name + " rtrecuerde que el estrato va de 1 a 3");
                System.out.print(".:Ingrese el estrato de su hogar: ");;
                range=ins.nextInt();
            }

        System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╍");
        System.out.println("Señor(a) " + name + " " + lastname + " que recibo desea cancelar");
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║▸ 1.Agua                                  ║");
        System.out.println("║▸ 2.Gas                                   ║");
        System.out.println("║▸ 3.Energia                               ║");
        System.out.println("╚══════════════════════════════════════════╝");
        option=ins.nextInt();

        while(option <  1 || option > 3 )
        {
            System.out.print(".:Seleccione el recibo que desea cancelar:. ");;
            option=ins.nextInt();
        }

        switch (option)
        {
            case 1:
                System.out.println("╔══════════════════════════════════════════╗");
                System.out.println("║                RECIBO AGUA               ║");
                System.out.println("╚══════════════════════════════════════════╝ ");
                System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╍");

                if(range == 1)
                {
                    float  cargoFijo=2229F,tarifaConsumo=690,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva5;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO AGUA               ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else if(range == 2)
                {
                    float  cargoFijo=4458,tarifaConsumo=1381,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva10;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO AGUA               ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else
                {
                    float  cargoFijo=6316,tarifaConsumo=1956,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva15;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO AGUA               ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");

                }
               break;

            case 2:
                System.out.println("╔══════════════════════════════════════════╗");
                System.out.println("║                RECIBO GAS                ║");
                System.out.println("╚══════════════════════════════════════════╝ ");
                System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╍");

                if(range == 1)
                {
                    float  cargoFijo=2400,tarifaConsumo=800,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva5;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO GAS                ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else if(range == 2)
                {
                    float  cargoFijo=3000,tarifaConsumo=1299,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva10;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO GAS                ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else
                {
                    float  cargoFijo=4200,tarifaConsumo=1600,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva15;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║                RECIBO GAS                ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");

                }
                break;

            case 3:
                System.out.println("╔══════════════════════════════════════════╗");
                System.out.println("║              RECIBO ENERGÍA              ║");
                System.out.println("╚══════════════════════════════════════════╝ ");
                System.out.println("╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╍");

                if(range == 1)
                {
                    float  cargoFijo=3500,tarifaConsumo=1000,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva5;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║              RECIBO ENERGÍA              ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else if(range == 2)
                {
                    float  cargoFijo=4200,tarifaConsumo=1500,iva;
                    System.out.println("▸ Ingrese la cantidad de mts3 consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva10;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║              RECIBO ENERGÍA              ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                }

                else
                {
                    float  cargoFijo=5000,tarifaConsumo=2600,iva;
                    System.out.println("▸ Cantidad de kilobatios consumidos: ");
                    agua=ins.nextFloat();
                    temp=agua*tarifaConsumo;
                    iva=temp * iva15;
                    subtotal= temp+cargoFijo;
                    total=subtotal+iva;

                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║              RECIBO ENERGÍA              ║");
                    System.out.println("║ ╍╌╍╌╍╌╍╌╍╌╍╌╍╌╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍╌╍ ║");
                    System.out.println("║ ▸Nombre  :  " + name +"	 	           ║");
                    System.out.println("║ ▸Apellido    :  " + lastname + "         ║");
                    System.out.println("║ ▸Dirección   :  " + address +"           ║");
                    System.out.println("║ ▸Estrato    :  "  + range+"              ║");
                    System.out.println("║ ▸Cargo fijo  : "+cargoFijo+"    \t\t         ║");
                    System.out.println("║ ▸Tariga consumo:"+tarifaConsumo+"        ║");
                    System.out.println("║ ▸SubTotal    : "  + subtotal+ " \t\t         ║");
                    System.out.println("║ ▸Total     : "  + total+ " \t\t          ║");
                    System.out.println("╚══════════════════════════════════════════╝");

                }
                break;



        }


    }
}
