package java_core.inheritance5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) throws ReflectiveOperationException{
        String name;
        if(args.length>0) name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name, e.g. java.util.Date: ");
            name = in.next();
        }

        Class cl = Class.forName(name);
        Class superCl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if(modifiers.length()>0)
            System.out.print(modifiers + " ");
        System.out.println("class " + name);
        if (superCl != null && superCl != Object.class)
            System.out.print(" extends " + superCl.getName());

        System.out.println("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");

    }
    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c: constructors){
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length()>0)
                System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for(int j=0; j<paramTypes.length; j++){
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        for(Method m: methods){
            String name = m.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length()>0)
                System.out.print(modifiers + " ");
            System.out.println(name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for(int j=0; j<paramTypes.length; j++){
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for(Field f: fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length()> 0)
                System.out.print( modifiers +" ");
            System.out.println(type.getName() +" " + name + ";");
        }
    }
}
