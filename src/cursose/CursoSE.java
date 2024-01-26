package cursose;

import java.util.Scanner;

public class CursoSE {

    public static void  main(String... Mitocode){
        /*
        un banco tiene 3 clientes que pueden hacer depositos y retiros.
        Tambien el banco requiere que al final del dia calcule la cantidad
        de dinero que hay depositada.

        entidades: Persona, Banco
         */
        //simulamos que es una base de datos
        //NO USAMOS BANCO PERO PODRIAMOS USARLO EN VEZ DE ESTO...
        /*
        Persona persona1 = new Persona();
        persona1.setCuenta(1);
        persona1.setNombre(" Mito");
        persona1.setMonto(1000);

        Persona persona2 = new Persona();
        persona2.setCuenta(2);
        persona2.setNombre(" Code");
        persona2.setMonto(1000);

        Persona persona3 = new Persona();
        persona3.setCuenta(3);
        persona3.setNombre(" Jaime");
        persona3.setMonto(1000);
*/
        //AHORA USAREMOS BANCO...
        //nos vamos a apoyar en una clase Banco, en una objeto banco
        // estariamos reemplazando persona1 por banco.getPer1() y asi hasta la 3ra persona
        Banco banco = new Banco();

        Scanner sc =  new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("BIENVENIDO AL BANCO XYZ, por favor ingrese el numero de cuenta");
        int cuenta = sc.nextInt();
        String operacion = "";//lo inicializa con vacio

        switch (cuenta){
            case 1:
                System.out.println("Bienvenido" + banco.getPer1().getNombre());
                System.out.println("----------------------------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion){
                    case "A":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a depositar");
                        double montoDeposito =  sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoAnteriorDeposito+montoDeposito);
                        System.out.println("El monto final es " + banco.getPer1().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a retirar");
                        double montoRetiro =  sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoAnteriorRetiro-montoRetiro);
                        System.out.println("El monto final es " + banco.getPer1().getMonto());
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenido" + banco.getPer2().getNombre());
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion){
                    case "A":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a depositar");
                        double montoDeposito =  sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoAnteriorDeposito+montoDeposito);
                        System.out.println("El monto final es " + banco.getPer2().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a retirar");
                        double montoRetiro =  sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoAnteriorRetiro-montoRetiro);
                        System.out.println("El monto final es " + banco.getPer2().getMonto());
                        break;
                }
                break;
            case 3:
                System.out.println("Bienvenido" + banco.getPer3().getNombre());
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion){
                    case "A":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a depositar");
                        double montoDeposito =  sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoAnteriorDeposito+montoDeposito);
                        System.out.println("El monto final es " + banco.getPer3().getMonto());
                        break;
                    case "B":
                        System.out.println("----------------------------------------------------");
                        System.out.println("Ingrese ingrese el monto a retirar");
                        double montoRetiro =  sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoAnteriorRetiro-montoRetiro);
                        System.out.println("El monto final es " + banco.getPer3().getMonto());
                        break;
                }
                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);

        }
        System.out.println(banco.getPer1().getMonto() + banco.getPer2().getMonto() + banco.getPer3().getMonto());
    }



}
