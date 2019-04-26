package lab2_ethanvilleda;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_EthanVilleda
{
    public static void main(String[] args)
    {
        String usuario, con, s1;
        int p, modi;
        ArrayList lista1=new ArrayList();
        ArrayList lista2=new ArrayList();
        ArrayList lista3=new ArrayList();
        ArrayList lista4=new ArrayList();
        Scanner l=new Scanner(System.in);
        Random r=new Random();
        System.out.println("1. Registro de empleados");
        System.out.println("2. Despedir empleados");
        System.out.println("3. Log in");
        System.out.println("4. Ascender cajero");
        System.out.println("5. Listar empleados");
        System.out.println("6. Modificar empleado");
        System.out.println("7. RANDOM");
        System.out.println("8. Salir");
        System.out.print("Que desea hacer? [1-8]: ");
        int opc=l.nextInt();
        System.out.println();
        if(opc==8)
        {
            System.exit(0);
        }
        while(opc<1|| opc>8)
        {
            System.out.print("Ingrese una opcion valida: ");
            opc=l.nextInt();
        }
        while(opc!=3)
        {
            System.out.println("Debe ingresar primero (Opcion 3)");
            System.out.println("1. Registro de empleados");
            System.out.println("2. Despedir empleados");
            System.out.println("3. Log in");
            System.out.println("4. Ascender cajero");
            System.out.println("5. Listar empleados");
            System.out.println("6. Modificar empleado");
            System.out.println("7. RANDOM");
            System.out.println("8. Salir");
            System.out.print("Que desea hacer? [1-8]: ");
            opc=l.nextInt();
            System.out.println();
            if(opc==8)
            {
                System.exit(0);
            }
            while(opc<1|| opc>8)
            {
                System.out.print("Ingrese una opcion valida: ");
                opc=l.nextInt();
            }
        }
        System.out.print("Ingrese nombre de usuario: ");
        usuario=l.next();
        while(!usuario.equals("leobanegas"))
        {
            System.out.print("Ese nombre de ususario no esta registrado, ingrese uno valido: ");
            usuario=l.next();
        }
        System.out.print("Ingrese contraseña: ");
        con=l.next();
        while(!con.equals("99"))
        {
            System.out.print("Contraseña incorrecta, ingrese una valida: ");
            con=l.next();
        }
        System.out.println("1. Registro de empleados");
        System.out.println("2. Despedir empleados");
        System.out.println("3. Log in");
        System.out.println("4. Ascender cajero");
        System.out.println("5. Listar empleados");
        System.out.println("6. Modificar empleado");
        System.out.println("7. RANDOM");
        System.out.println("8. Salir");
        System.out.print("Que desea hacer? [1-8]: ");
        opc=l.nextInt();
        System.out.println();
        while(opc<1|| opc>8)
        {
            System.out.print("Ingrese una opcion valida: ");
            opc=l.nextInt();
        }
        while(opc>0&& opc<8)
        {
            switch (opc)
            {
                case 1: 
                    System.out.print("Ingrese su nombre: ");
                    String nombre=l.next();
                    System.out.println();
                    System.out.print("Ingrese su apellido: ");
                    String apellido=l.next();
                    System.out.println();
                    System.out.print("Ingrese su color favorito: ");
                    String color=l.next();
                    System.out.println();
                    System.out.print("Ingrese su edad: ");
                    int edad=l.nextInt();
                    System.out.println();
                    System.out.print("Ingrese su sexo [H/M]: ");
                    char sexo=l.next().charAt(0);
                    System.out.println();
                    while(sexo!='H'&& sexo!='h'&& sexo!='M'&& sexo!='m')
                    {
                        System.out.print("Ingrese la primera letra de su sexo [H/M]: ");
                        sexo=l.next().charAt(0);
                        System.out.println();
                    }
                    System.out.print("Ingrese su altura: ");
                    double altura=l.nextDouble();
                    System.out.println();
                    System.out.print("Ingrese su peso: ");
                    double peso=l.nextDouble();
                    System.out.println();
                    System.out.print("Ingrese su titulo: ");
                    String titulo=l.next();
                    System.out.println();
                    System.out.println("1. Gerente");
                    System.out.println("2. Aseador(a)");
                    System.out.println("3. Cajero(a)");
                    System.out.println("4. Seguridad");
                    System.out.print("Que cargo se le asigna? [1-4]: ");
                    int cargo=l.nextInt();
                    while(cargo<0|| cargo>4)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        cargo=l.nextInt();
                    }
                    while(cargo==1)
                    {
                        if (lista1.size()>=3)
                        {
                            System.out.print("Ya hay 3 gerentes, elija otra opcion: ");
                            cargo=l.nextInt();
                        }
                    }
                    switch(cargo)
                    {
                        case 1: lista1.add(new Empleado(nombre, apellido, color, edad, sexo, altura, peso, titulo, cargo));
                            break;
                        case 2: lista2.add(new Empleado(nombre, apellido, color, edad, sexo, altura, peso, titulo, cargo));
                            break;
                        case 3: lista3.add(new Empleado(nombre, apellido, color, edad, sexo, altura, peso, titulo, cargo));
                            break;
                        case 4: lista4.add(new Empleado(nombre, apellido, color, edad, sexo, altura, peso, titulo, cargo));
                            break;
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("1. Gerente");
                    System.out.println("2. Aseador(a)");
                    System.out.println("3. Cajero(a)");
                    System.out.println("4. Seguridad");
                    System.out.print("Seleccione el cargo de la persona que desea despedir? [1-4]: ");
                    cargo=l.nextInt();
                    while(cargo<0|| cargo>4)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        cargo=l.nextInt();
                    }
                    switch(cargo)
                    {
                        case 1: s1="";
                            if(lista1.isEmpty())
                            {
                                System.out.println("La lista de gerentes esta vacia");
                                break;
                            }
                            s1+="Gerentes: \n";
                            for (Object t: lista1)
                            {
                                nombre=((Empleado)lista1.get(lista1.indexOf(t))).getNombre();
                                apellido=((Empleado)lista1.get(lista1.indexOf(t))).getApellido();
                                s1+= lista1.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea despedir: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista1.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            if(lista3.isEmpty())
                            {
                                System.out.println("La lista de cajeros esta vacia");
                                break;
                            }
                            lista1.remove(p);
                            String s3="";
                            s3+="Cajeros: \n";
                            for (Object t: lista3)
                            {
                                nombre=((Empleado)lista3.get(lista3.indexOf(t))).getNombre();
                                apellido=((Empleado)lista3.get(lista3.indexOf(t))).getApellido();
                                s3+= lista3.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s3 + "\n");
                            System.out.print("Ingrese la posicion que desea ascender: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista3.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            ((Empleado)lista3.get(p)).setCargo(1);
                            lista1.add((Empleado)lista3.get(p));
                            lista3.remove(p);
                            break;
                        case 2: s1="";
                            if(lista2.isEmpty())
                            {
                                System.out.println("La lista de aseadores esta vacia");
                                break;
                            }
                            s1+="Aseadores: \n";
                            for (Object t: lista2)
                            {
                                nombre=((Empleado)lista2.get(lista2.indexOf(t))).getNombre();
                                apellido=((Empleado)lista2.get(lista2.indexOf(t))).getApellido();
                                s1+= lista2.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea despedir: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista2.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            lista2.remove(p);
                            break;
                        case 3: s1="";
                            if(lista3.isEmpty())
                            {
                                System.out.println("La lista de cajeros esta vacia");
                                break;
                            }
                            s1+="Cajeros: \n";
                            for (Object t: lista3)
                            {
                                nombre=((Empleado)lista3.get(lista3.indexOf(t))).getNombre();
                                apellido=((Empleado)lista3.get(lista3.indexOf(t))).getApellido();
                                s1+= lista3.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea despedir: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista3.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            lista3.remove(p);
                            break;
                        case 4: s1="";
                            if(lista4.isEmpty())
                            {
                                System.out.println("La lista de seguridad esta vacia");
                                break;
                            }
                            s1+="Seguridad: \n";
                            for (Object t: lista4)
                            {
                                nombre=((Empleado)lista4.get(lista4.indexOf(t))).getNombre();
                                apellido=((Empleado)lista4.get(lista4.indexOf(t))).getApellido();
                                s1+= lista4.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea despedir: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista4.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            lista4.remove(p);
                            break;
                    }
                    break;
                case 3: System.out.println("Ya se ha ingresado");
                    break;
                case 4: String s2="";
                    if(lista3.isEmpty())
                    {
                        System.out.println("La lista de cajeros esta vacia");
                        break;
                    }
                    s2+="Cajeros: \n";
                    for (Object t: lista3)
                    {
                        nombre=((Empleado)lista3.get(lista3.indexOf(t))).getNombre();
                        apellido=((Empleado)lista3.get(lista3.indexOf(t))).getApellido();
                        s2+= lista3.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                    }
                    System.out.println(s2 + "\n");
                    System.out.print("Ingrese la posicion que desea ascender: ");
                    p=l.nextInt();
                    while (p<0|| p>=lista3.size())
                    {
                        System.out.print("Ingrese una posicion valida: ");
                        p=l.nextInt();
                    }
                    while(lista1.size()>=3)
                    {
                        System.out.println("Ya hay 3 gerentes");
                        break;
                    }
                    ((Empleado)lista3.get(p)).setCargo(1);
                    lista1.add((Empleado)lista3.get(p));
                    lista3.remove(p);
                    break;
                case 5: String salida="";
                    salida+="Gerentes \n";
                    for(Object t: lista1)
                    {
                        salida+=lista1.indexOf(t)+ "\n" + t + "\n";
                    }
                    salida+="Aseadores \n";
                    for(Object t: lista2)
                    {
                        salida+=lista2.indexOf(t)+ "\n " + t + "\n";
                    }
                    salida+="Cajeros \n";
                    for(Object t: lista3)
                    {
                        salida+=lista3.indexOf(t)+ "\n" + t + "\n";
                    }
                    salida+="Seguridad \n";
                    for(Object t: lista4)
                    {
                        salida+=lista4.indexOf(t)+ "\n" + t + "\n";
                    }
                    System.out.println(salida);
                    break;
                case 6: System.out.println("1. Gerente");
                    System.out.println("2. Aseador(a)");
                    System.out.println("3. Cajero(a)");
                    System.out.println("4. Seguridad");
                    System.out.print("Seleccione el cargo de la persona que desea despedir? [1-4]: ");
                    cargo=l.nextInt();
                    while(cargo<0|| cargo>4)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        cargo=l.nextInt();
                    }
                    switch(cargo)
                    {
                        case 1: s1="";
                            if(lista1.isEmpty())
                            {
                                System.out.println("La lista de gerentes esta vacia");
                                break;
                            }
                            for (Object t: lista1)
                            {
                                nombre=((Empleado)lista1.get(lista1.indexOf(t))).getNombre();
                                apellido=((Empleado)lista1.get(lista1.indexOf(t))).getApellido();
                                s1+= lista1.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea modificar: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista1.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            System.out.println("1. Modificar nombre");
                            System.out.println("2. Modificar apellido");
                            System.out.println("3. Modificar color favorito");
                            System.out.println("4. Modificar edad");
                            System.out.println("5. Modificar sexo");
                            System.out.println("6. Modificar altura");
                            System.out.println("7. Modificar peso");
                            System.out.println("8. Modificar titulo");
                            System.out.println("9. Modificar cargo");
                            System.out.print("Que desea hacer? [1-9]");
                            modi=l.nextInt();
                            while(modi<1|| modi>9)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                modi=l.nextInt();
                            }
                            switch(modi)
                            {
                                case 1: System.out.print("Ingrese el nuevo nombre: ");
                                    nombre=l.next();
                                    ((Empleado)lista1.get(p)).setNombre(nombre);
                                    break;
                                case 2: System.out.print("Ingrese el nuevo apellido: ");
                                    apellido=l.next();
                                    ((Empleado)lista1.get(p)).setApellido(apellido);
                                    break;
                                case 3: System.out.print("Ingrese el nuevo color favorito: ");
                                    color=l.next();
                                    ((Empleado)lista1.get(p)).setColor(color);
                                    break;
                                case 4: System.out.print("Ingrese la nurvs edad: ");
                                    edad=l.nextInt();
                                    ((Empleado)lista1.get(p)).setEdad(edad);
                                    break;
                                case 5: System.out.print("Ingrese el nuevo sexo: ");
                                    sexo=l.next().charAt(0);
                                    ((Empleado)lista1.get(p)).setSexo(sexo);
                                    break;
                                case 6: System.out.print("Ingrese la nuevo altura: ");
                                    altura=l.nextDouble();
                                    ((Empleado)lista1.get(p)).setAltura(altura);
                                    break;
                                case 7: System.out.print("Ingrese el nuevo peso: ");
                                    peso=l.nextDouble();
                                    ((Empleado)lista1.get(p)).setPeso(peso);
                                    break;
                                case 8: System.out.print("Ingrese el nuevo titulo: ");
                                    titulo=l.next();
                                    ((Empleado)lista1.get(p)).setTitulo(titulo);
                                    break;
                                case 9: System.out.println("1. Gerente");
                                    System.out.println("2. Aseador(a)");
                                    System.out.println("3. Cajero(a)");
                                    System.out.println("4. Seguridad");
                                    System.out.print("Ingrese el nuevo cargo[1-4]: ");
                                    cargo=l.nextInt();
                                    while (cargo==1)
                                    {
                                        if (lista1.size()>=3)
                                        {
                                            System.out.println("Ya hay 3 gerentes, ingrese un cargo valido: ");
                                            cargo=l.nextInt();
                                        }
                                    }
                                    ((Empleado)lista1.get(p)).setCargo(cargo);
                                    switch(cargo)
                                        {
                                            case 1: while(lista1.size()>=3)
                                            {
                                                System.out.println("Ya hay 3 gerentes");
                                                break;
                                            }
                                            lista1.add((Empleado)lista1.get(p));
                                                break;
                                            case 2: lista2.add((Empleado)lista1.get(p));
                                                break;
                                            case 3: lista3.add((Empleado)lista1.get(p));
                                                break;
                                            case 4: lista4.add((Empleado)lista1.get(p));
                                                break;
                                        }
                                    break;
                            }
                            break;
                        case 2: s1="";
                            if(lista2.isEmpty())
                            {
                                System.out.println("La lista de aseadores esta vacia");
                                break;
                            }
                            for (Object t: lista2)
                            {
                                nombre=((Empleado)lista2.get(lista2.indexOf(t))).getNombre();
                                apellido=((Empleado)lista2.get(lista2.indexOf(t))).getApellido();
                                s1+= lista2.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea modificar: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista2.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            System.out.println("1. Modificar nombre");
                            System.out.println("2. Modificar apellido");
                            System.out.println("3. Modificar color favorito");
                            System.out.println("4. Modificar edad");
                            System.out.println("5. Modificar sexo");
                            System.out.println("6. Modificar altura");
                            System.out.println("7. Modificar peso");
                            System.out.println("8. Modificar titulo");
                            System.out.println("9. Modificar cargo");
                            System.out.print("Que desea hacer? [1-9]");
                            modi=l.nextInt();
                            while(modi<1|| modi>9)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                modi=l.nextInt();
                            }
                            switch(modi)
                            {
                                case 1: System.out.print("Ingrese el nuevo nombre: ");
                                    nombre=l.next();
                                    ((Empleado)lista2.get(p)).setNombre(nombre);
                                    break;
                                case 2: System.out.print("Ingrese el nuevo apellido: ");
                                    apellido=l.next();
                                    ((Empleado)lista2.get(p)).setApellido(apellido);
                                    break;
                                case 3: System.out.print("Ingrese el nuevo color favorito: ");
                                    color=l.next();
                                    ((Empleado)lista2.get(p)).setColor(color);
                                    break;
                                case 4: System.out.print("Ingrese la nurvs edad: ");
                                    edad=l.nextInt();
                                    ((Empleado)lista2.get(p)).setEdad(edad);
                                    break;
                                case 5: System.out.print("Ingrese el nuevo sexo: ");
                                    sexo=l.next().charAt(0);
                                    ((Empleado)lista2.get(p)).setSexo(sexo);
                                    break;
                                case 6: System.out.print("Ingrese la nuevo altura: ");
                                    altura=l.nextDouble();
                                    ((Empleado)lista2.get(p)).setAltura(altura);
                                    break;
                                case 7: System.out.print("Ingrese el nuevo peso: ");
                                    peso=l.nextDouble();
                                    ((Empleado)lista2.get(p)).setPeso(peso);
                                    break;
                                case 8: System.out.print("Ingrese el nuevo titulo: ");
                                    titulo=l.next();
                                    ((Empleado)lista2.get(p)).setTitulo(titulo);
                                    break;
                                case 9: System.out.println("1. Gerente");
                                    System.out.println("2. Aseador(a)");
                                    System.out.println("3. Cajero(a)");
                                    System.out.println("4. Seguridad");
                                    System.out.print("Ingrese el nuevo cargo[1-4]: ");
                                    cargo=l.nextInt();
                                    while (cargo==1)
                                    {
                                        if (lista1.size()>=3)
                                        {
                                            System.out.println("Ya hay 3 gerentes, ingrese un cargo valido: ");
                                            cargo=l.nextInt();
                                        }
                                    }
                                    ((Empleado)lista2.get(p)).setCargo(cargo);
                                    switch(cargo)
                                    {
                                        case 1: System.out.println("No puede ser ascendido a gerente");
                                            break;
                                        case 2: lista2.add((Empleado)lista2.get(p));
                                            break;
                                        case 3: lista3.add((Empleado)lista2.get(p));
                                            break;
                                        case 4: lista4.add((Empleado)lista2.get(p));
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 3: s1="";
                            if(lista3.isEmpty())
                            {
                                System.out.println("La lista de aseadores esta vacia");
                                break;
                            }
                            for (Object t: lista3)
                            {
                                nombre=((Empleado)lista3.get(lista3.indexOf(t))).getNombre();
                                apellido=((Empleado)lista3.get(lista3.indexOf(t))).getApellido();
                                s1+= lista3.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea modificar: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista3.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            System.out.println("1. Modificar nombre");
                            System.out.println("2. Modificar apellido");
                            System.out.println("3. Modificar color favorito");
                            System.out.println("4. Modificar edad");
                            System.out.println("5. Modificar sexo");
                            System.out.println("6. Modificar altura");
                            System.out.println("7. Modificar peso");
                            System.out.println("8. Modificar titulo");
                            System.out.println("9. Modificar cargo");
                            System.out.print("Que desea hacer? [1-9]");
                            modi=l.nextInt();
                            while(modi<1|| modi>9)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                modi=l.nextInt();
                            }
                            switch(modi)
                            {
                                case 1: System.out.print("Ingrese el nuevo nombre: ");
                                    nombre=l.next();
                                    ((Empleado)lista3.get(p)).setNombre(nombre);
                                    break;
                                case 2: System.out.print("Ingrese el nuevo apellido: ");
                                    apellido=l.next();
                                    ((Empleado)lista3.get(p)).setApellido(apellido);
                                    break;
                                case 3: System.out.print("Ingrese el nuevo color favorito: ");
                                    color=l.next();
                                    ((Empleado)lista3.get(p)).setColor(color);
                                    break;
                                case 4: System.out.print("Ingrese la nurvs edad: ");
                                    edad=l.nextInt();
                                    ((Empleado)lista3.get(p)).setEdad(edad);
                                    break;
                                case 5: System.out.print("Ingrese el nuevo sexo: ");
                                    sexo=l.next().charAt(0);
                                    ((Empleado)lista3.get(p)).setSexo(sexo);
                                    break;
                                case 6: System.out.print("Ingrese la nuevo altura: ");
                                    altura=l.nextDouble();
                                    ((Empleado)lista3.get(p)).setAltura(altura);
                                    break;
                                case 7: System.out.print("Ingrese el nuevo peso: ");
                                    peso=l.nextDouble();
                                    ((Empleado)lista3.get(p)).setPeso(peso);
                                    break;
                                case 8: System.out.print("Ingrese el nuevo titulo: ");
                                    titulo=l.next();
                                    ((Empleado)lista3.get(p)).setTitulo(titulo);
                                    break;
                                case 9: System.out.println("1. Gerente");
                                    System.out.println("2. Aseador(a)");
                                    System.out.println("3. Cajero(a)");
                                    System.out.println("4. Seguridad");
                                    System.out.print("Ingrese el nuevo cargo[1-4]: ");
                                    cargo=l.nextInt();
                                    while (cargo==1)
                                    {
                                        if (lista1.size()>=3)
                                        {
                                            System.out.println("Ya hay 3 gerentes, ingrese un cargo valido: ");
                                            cargo=l.nextInt();
                                        }
                                    }
                                    ((Empleado)lista3.get(p)).setCargo(cargo);
                                    switch(cargo)
                                    {
                                        case 1: while(lista1.size()>=3)
                                            {
                                                System.out.println("Ya hay 3 gerentes");
                                                break;
                                            }
                                            lista1.add((Empleado)lista3.get(p));
                                            break;
                                        case 2: lista2.add((Empleado)lista3.get(p));
                                            break;
                                        case 3: lista3.add((Empleado)lista3.get(p));
                                            break;
                                        case 4: lista4.add((Empleado)lista3.get(p));
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 4: s1="";
                            if(lista4.isEmpty())
                            {
                                System.out.println("La lista de aseadores esta vacia");
                                break;
                            }
                            for (Object t: lista4)
                            {
                                nombre=((Empleado)lista4.get(lista4.indexOf(t))).getNombre();
                                apellido=((Empleado)lista4.get(lista4.indexOf(t))).getApellido();
                                s1+= lista4.indexOf(t) + "\n" + nombre + " " + apellido + "\n";
                            }
                            System.out.println(s1 + "\n");
                            System.out.print("Ingrese la posicion que desea modificar: ");
                            p=l.nextInt();
                            while (p<0|| p>=lista4.size())
                            {
                                System.out.print("Ingrese una posicion valida: ");
                                p=l.nextInt();
                            }
                            System.out.println("1. Modificar nombre");
                            System.out.println("2. Modificar apellido");
                            System.out.println("3. Modificar color favorito");
                            System.out.println("4. Modificar edad");
                            System.out.println("5. Modificar sexo");
                            System.out.println("6. Modificar altura");
                            System.out.println("7. Modificar peso");
                            System.out.println("8. Modificar titulo");
                            System.out.println("9. Modificar cargo");
                            System.out.print("Que desea hacer? [1-9]");
                            modi=l.nextInt();
                            while(modi<1|| modi>9)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                modi=l.nextInt();
                            }
                            switch(modi)
                            {
                                case 1: System.out.print("Ingrese el nuevo nombre: ");
                                    nombre=l.next();
                                    ((Empleado)lista4.get(p)).setNombre(nombre);
                                    break;
                                case 2: System.out.print("Ingrese el nuevo apellido: ");
                                    apellido=l.next();
                                    ((Empleado)lista4.get(p)).setApellido(apellido);
                                    break;
                                case 3: System.out.print("Ingrese el nuevo color favorito: ");
                                    color=l.next();
                                    ((Empleado)lista4.get(p)).setColor(color);
                                    break;
                                case 4: System.out.print("Ingrese la nurvs edad: ");
                                    edad=l.nextInt();
                                    ((Empleado)lista4.get(p)).setEdad(edad);
                                    break;
                                case 5: System.out.print("Ingrese el nuevo sexo: ");
                                    sexo=l.next().charAt(0);
                                    ((Empleado)lista4.get(p)).setSexo(sexo);
                                    break;
                                case 6: System.out.print("Ingrese la nuevo altura: ");
                                    altura=l.nextDouble();
                                    ((Empleado)lista4.get(p)).setAltura(altura);
                                    break;
                                case 7: System.out.print("Ingrese el nuevo peso: ");
                                    peso=l.nextDouble();
                                    ((Empleado)lista4.get(p)).setPeso(peso);
                                    break;
                                case 8: System.out.print("Ingrese el nuevo titulo: ");
                                    titulo=l.next();
                                    ((Empleado)lista4.get(p)).setTitulo(titulo);
                                    break;
                                case 9: System.out.println("1. Gerente");
                                    System.out.println("2. Aseador(a)");
                                    System.out.println("3. Cajero(a)");
                                    System.out.println("4. Seguridad");
                                    System.out.print("Ingrese el nuevo cargo[1-4]: ");
                                    cargo=l.nextInt();
                                    while (cargo==1)
                                    {
                                        if (lista1.size()>=3)
                                        {
                                            System.out.println("Ya hay 3 gerentes, ingrese un cargo valido: ");
                                            cargo=l.nextInt();
                                        }
                                    }
                                    ((Empleado)lista4.get(p)).setCargo(cargo);
                                    switch(cargo)
                                    {
                                        case 1: System.out.println("No puede ser ascendido a gerente");
                                            break;
                                        case 2: lista2.add((Empleado)lista4.get(p));
                                            break;
                                        case 3: lista3.add((Empleado)lista4.get(p));
                                            break;
                                        case 4: lista4.add((Empleado)lista4.get(p));
                                            break;
                                    }
                            }
                            break;
                    }
                    break;
                case 7: int posi, ncar;
                    System.out.print("Ingrese un numero: ");
                    int ran=l.nextInt();
                    while (ran>(lista1.size()+lista2.size()+lista3.size()+lista4.size()))
                    {
                        System.out.print("No hay suficientes empleados, ingrese un numero mas pequeño: ");
                        ran=l.nextInt();
                    }
                    for (int i = 0; i < ran; i++) 
                    {
                        int j=r.nextInt(5);
                        switch (j)
                        {
                            case 0:posi=r.nextInt(lista1.size());
                                ran=1+r.nextInt(4);
                                ((Empleado)lista1.get(posi)).setCargo(ran);
                                switch(ran)
                                {
                                    case 1: lista1.add((Empleado)lista1.get(posi));
                                        lista1.remove(posi);
                                        break;
                                    case 2: lista2.add((Empleado)lista1.get(posi));
                                        lista1.remove(posi);
                                        break;
                                    case 3: lista3.add((Empleado)lista1.get(posi));
                                        lista1.remove(posi);
                                        break;
                                    case 4: lista4.add((Empleado)lista1.get(posi));
                                        lista1.remove(posi);
                                        break;
                                }
                                break;
                            case 1: posi=r.nextInt(lista2.size());
                                ran=1+r.nextInt(4);
                                ((Empleado)lista2.get(posi)).setCargo(ran);
                                switch(ran)
                                {
                                    case 1: lista1.add((Empleado)lista2.get(posi));
                                        lista2.remove(posi);
                                        break;
                                    case 2: lista2.add((Empleado)lista2.get(posi));
                                        lista2.remove(posi);
                                        break;
                                    case 3: lista3.add((Empleado)lista2.get(posi));
                                        lista2.remove(posi);
                                        break;
                                    case 4: lista4.add((Empleado)lista2.get(posi));
                                        lista2.remove(posi);
                                        break;
                                }
                                break;
                            case 2: posi=r.nextInt(lista3.size());
                                ran=1+r.nextInt(4);
                                ((Empleado)lista3.get(posi)).setCargo(ran);
                                switch(ran)
                                {
                                    case 1: lista1.add((Empleado)lista3.get(posi));
                                        lista3.remove(posi);
                                        break;
                                    case 2: lista2.add((Empleado)lista3.get(posi));
                                        lista3.remove(posi);
                                        break;
                                    case 3: lista3.add((Empleado)lista3.get(posi));
                                        lista3.remove(posi);
                                        break;
                                    case 4: lista4.add((Empleado)lista3.get(posi));
                                        lista3.remove(posi);
                                        break;
                                }
                                break;
                            case 3: posi=r.nextInt(lista4.size());
                                ran=1+r.nextInt(4);
                                ((Empleado)lista4.get(posi)).setCargo(ran);
                                switch(ran)
                                {
                                    case 1: lista1.add((Empleado)lista4.get(posi));
                                        lista4.remove(posi);
                                        break;
                                    case 2: lista2.add((Empleado)lista4.get(posi));
                                        lista4.remove(posi);
                                        break;
                                    case 3: lista3.add((Empleado)lista4.get(posi));
                                        lista4.remove(posi);
                                        break;
                                    case 4: lista4.add((Empleado)lista4.get(posi));
                                        lista4.remove(posi);
                                        break;
                                }
                                break;
                        }
                    }
                    break;
            }
            System.out.println("1. Registro de empleados");
            System.out.println("2. Despedir empleados");
            System.out.println("3. Log in");
            System.out.println("4. Ascender cajero");
            System.out.println("5. Listar empleados");
            System.out.println("6. Modificar empleado");
            System.out.println("7. RANDOM");
            System.out.println("8. Salir");
            System.out.print("Que desea hacer? [1-8]: ");
            opc=l.nextInt();
            System.out.println();
            while(opc<1|| opc>8)
            {
                System.out.print("Ingrese una opcion valida: ");
                opc=l.nextInt();
            }
        }
    }
}
