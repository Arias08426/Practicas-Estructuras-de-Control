package org.example;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre: ");

        int codMenuPpal;
        int cantidadPlatos = 0;
        int cantidadPlatosTipicos = 0;
        int cantidadPlatosALaCarta = 0;
        int cantidadPlatosInternacionales = 0;
        int totalAPagar = 0;

        String detallePlatos = "";

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opción \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    String menuTipicos = "PLATOS TIPICOS\n\n";
                    menuTipicos += "1. Frijoles - $12000\n";
                    menuTipicos += "2. Bandeja Paisa - $15000\n";
                    menuTipicos += "3. Sancocho - $14000\n";
                    menuTipicos += "4. Volver al menu principal\n\n";
                    menuTipicos += "Seleccione una opción: ";
                    int codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipicos));

                    switch (codMenuTipico) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $12000");
                            cantidadPlatos++;
                            cantidadPlatosTipicos++;
                            totalAPagar += 12000;
                            detallePlatos += "Frijoles - $12000\n";
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado una Bandeja Paisa, el costo es de $15000");
                            cantidadPlatos++;
                            cantidadPlatosTipicos++;
                            totalAPagar += 15000;
                            detallePlatos += "Bandeja Paisa - $15000\n";
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado un Sancocho, el costo es de $14000");
                            cantidadPlatos++;
                            cantidadPlatosTipicos++;
                            totalAPagar += 14000;
                            detallePlatos += "Sancocho - $14000\n";
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    String menuALaCarta = "PLATOS A LA CARTA\n\n";
                    menuALaCarta += "1. Lomo Saltado - $25000\n";
                    menuALaCarta += "2. Ensalada César - $15000\n";
                    menuALaCarta += "3. Pescado a la Plancha - $20000\n";
                    menuALaCarta += "4. Volver al menu principal\n\n";
                    menuALaCarta += "Seleccione una opción: ";
                    int codMenuALaCarta = Integer.parseInt(JOptionPane.showInputDialog(menuALaCarta));

                    switch (codMenuALaCarta) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado un Lomo Saltado, el costo es de $25000");
                            cantidadPlatos++;
                            cantidadPlatosALaCarta++;
                            totalAPagar += 25000;
                            detallePlatos += "Lomo Saltado - $25000\n";
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado una Ensalada César, el costo es de $15000");
                            cantidadPlatos++;
                            cantidadPlatosALaCarta++;
                            totalAPagar += 15000;
                            detallePlatos += "Ensalada César - $15000\n";
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado un Pescado a la Plancha, el costo es de $20000");
                            cantidadPlatos++;
                            cantidadPlatosALaCarta++;
                            totalAPagar += 20000;
                            detallePlatos += "Pescado a la Plancha - $20000\n";
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 3:
                    String menuInternacionales = "PLATOS INTERNACIONALES\n\n";
                    menuInternacionales += "1. Sushi - $18000\n";
                    menuInternacionales += "2. Pizza - $17000\n";
                    menuInternacionales += "3. Tacos - $16000\n";
                    menuInternacionales += "4. Volver al menu principal\n\n";
                    menuInternacionales += "Seleccione una opción: ";
                    int codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacionales));

                    switch (codMenuInternacional) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sushi, el costo es de $18000");
                            cantidadPlatos++;
                            cantidadPlatosInternacionales++;
                            totalAPagar += 18000;
                            detallePlatos += "Sushi - $18000\n";
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado una Pizza, el costo es de $17000");
                            cantidadPlatos++;
                            cantidadPlatosInternacionales++;
                            totalAPagar += 17000;
                            detallePlatos += "Pizza - $17000\n";
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado unos Tacos, el costo es de $16000");
                            cantidadPlatos++;
                            cantidadPlatosInternacionales++;
                            totalAPagar += 16000;
                            detallePlatos += "Tacos - $16000\n";
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 4:
                    imprimirFactura(nombreUsuario, cantidadPlatos, cantidadPlatosTipicos, cantidadPlatosALaCarta, cantidadPlatosInternacionales, totalAPagar, detallePlatos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }

    public static void imprimirFactura(String nombre, int totalPlatos, int tipicos, int aLaCarta, int internacionales, int total, String detalle) {
        String factura = "---- Factura ----\n";
        factura += "Nombre del usuario: " + nombre + "\n";
        factura += "Total de platos procesados: " + totalPlatos + "\n";
        factura += "Total de platos típicos: " + tipicos + "\n";
        factura += "Total de platos a la carta: " + aLaCarta + "\n";
        factura += "Total de platos internacionales: " + internacionales + "\n";
        factura += "Detalle de los platos:\n" + detalle;
        factura += "Valor total a pagar: $" + total + "\n";
        factura += "------------------";
        JOptionPane.showMessageDialog(null, factura);
    }
}
