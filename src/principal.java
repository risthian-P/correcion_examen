import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dato = 1;
        int i, nhabit;
        String pais, contin, ciudad,canton, parroquia;

        //objetos e instancias

        parroquia a[] = new parroquia[dato];
        cantones b[] = new cantones[dato];
        ciudades c[] = new ciudades[dato];
        paises d[] =  new paises[dato];

        System.out.println("ingresar el numero de datos a ingresar: ");
        dato = entrada.nextInt();
        entrada.nextLine();

        for (i=0;i<=dato;i++){
            System.out.println("ingreso numero "+ (i+1));
            System.out.println("ingresar el pais");
            pais = entrada.nextLine();
            System.out.println("ingresar el continente");
            contin = entrada.nextLine();
            System.out.println("ingresar la ciudad");
            ciudad = entrada.nextLine();
            System.out.println("ingresar el n habitantes");
            nhabit = entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingresar el canton ");
            canton = entrada.nextLine();
            System.out.println("ingresar el parroquia");
            parroquia = entrada.nextLine();

            a[i] = new parroquia(pais,contin,ciudad,nhabit,canton,parroquia);

        }

        for(i=0; i<=dato ;i++){

            System.out.println(a[i].getNombpais() + ", " + a[i].getNomcontinente() + ", " + a[i].getNombciudad() + ", " + a[i].getNhabitantes() + ", " + a[i].getNombcanton() + ", " + a[i].getNombparroquia());

        }
    }
}
