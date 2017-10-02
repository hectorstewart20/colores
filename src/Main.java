import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main (String [ ] args) {

        int i=0;
        System.out.println("Color inicial:");
        Scanner dato1 = new Scanner(System.in);
        short r = dato1.nextShort();
        short g = dato1.nextShort();
        short b = dato1.nextShort();
        Color c = new Color(r,g,b);

        while (i < 1){
            i++;


            System.out.println("Color a sumar");
            Scanner dato = new Scanner(System.in);

            /*int r2 = dato.nextInt();
            int g2 = dato.nextInt();
            int b2 = dato.nextInt();*/
            short r2 = dato1.nextShort();
            short g2 = dato1.nextShort();
            short b2 = dato1.nextShort();
            short[] nuevo_c = c.Suma(r2, g2, b2);
            System.out.println(Arrays.toString(nuevo_c));
            System.out.println(Arrays.toString(nuevo_c));

                        System.out.println("coloque otra linea a proposito");



    }
}
}
