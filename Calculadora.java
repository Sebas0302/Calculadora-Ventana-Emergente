package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
        
        //Variable
        String menu;
        double sum, res, mul, div;
        double num1, num2;
        int exit;
        
        //Menu de opciones
        while(true){
            menu = JOptionPane.showInputDialog("Ingrese la opción que desea realizar:"
                    + "\n1. Suma"
                    + "\n2. Resta"
                    + "\n3. Multiplicación"
                    + "\n4. División"
                    + "\n5. Todas las operaciones"
                    + "\n\n6. Salir");
            
            if(menu.equals("6") || menu.equalsIgnoreCase("salir")){
                exit = JOptionPane.showConfirmDialog(null
                        , "¿Quieres salir de la calculadora?"
                        , "Salir"
                        , JOptionPane.YES_NO_OPTION);
                if(exit == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora");
                    break;
                }
            }
            
            //Opciones
            switch(menu){
                
                //1. Suma
                case "1":
                case "Suma":
                case "suma":
                    
                    //Pedir datos
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    
                    //Operación
                    sum = num1+num2;
        
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+sum);
                    break;
                    
                //2. Resta
                case "2":
                case "Resta":
                case "resta":
                    
                    //Pedir datos
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    
                    //Operación
                    res = num1-num2;
        
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+res);
                    break;
                    
                //3. Multiplicación    
                case "3":
                case "Multiplicación":
                case "multiplicación":
                case "Multiplicacion":
                case "multiplicacion":
                    
                    //Pedir datos
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    
                    //Operación
                    mul = num1*num2;
        
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+mul);
                    break;
                    
                //4. División    
                case "4":
                case "División":
                case "división":
                case "Division":
                case "division":
                    
                    //Pedir datos
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    
                    //Operación
                    div = num1/num2;
        
                    //Salida de datos
                    if(num2 !=0){     //Muestra resultado si el num2 no es igual a 0
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+div);
                    }else{     //Muestra resultado si el num2  es igual a 0   
                        JOptionPane.showMessageDialog(null, "Error. No es posible dividir entre 0");
                    break;
                    }
                    
                //5. Todas las operaciones
                case "5":    
                case "Todas las operaciones":    
                case "todas las operaciones":
                    
                    //Pedir datos
                    
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                    
                    //Operaciones
                    sum = num1+num2;
                    res = num1-num2;
                    mul = num1*num2;
                    div = num1/num2;
                    
                    //Salida de datos
                    
                    if(num2 == 0){  //muestar resultado si el numero 2 es 0
                        JOptionPane.showMessageDialog(null, "El resultado de las operaciones son:"
                                + "\nSuma: "+sum
                                + "\nResta: "+res
                                + "\nMultiplicación: "+mul
                                + "\nDivisón: "+"No es posible dividir entre 0");
                    }else{   //muestar resultado si el numero 2 no es 0
                        JOptionPane.showMessageDialog(null, "El resultado de las operaciones son:"
                                + "\nSuma: "+sum
                                + "\nResta: "+res
                                + "\nMultiplicación: "+mul
                                + "\nDivisón: "+ div);
                    }
            } 
        }
    }
}
