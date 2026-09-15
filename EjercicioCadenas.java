
public class EjercicioCadenas {
    public static void main(String[] args) {

        String cadena1 = "la programacion es una habilidad muy valiosa en la actualidad";
        String cadena2 = "Java es un lenguaje muy utilizado en el desarrollo de software";

        mostrarCadena("Cadena 1", cadena1);
        mostrarCadena("Cadena 2", cadena2);

        char caracterPos6 = cadena1.charAt(6);
        System.out.println("\nCaracter en la posicion 6 de cadena1: "+caracterPos6);

        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();
        System.out.println("\nLongitud de cadena1: " + longitud1);
        System.out.println("Longitud de cadena2: " + longitud2);

        int primeraE = cadena1.indexOf('e');
        System.out.println("\nPrimera ocurrencia 'e' en cadena1: "+primeraE);

        int ultimaE = cadena2.lastIndexOf('e');
        System.out.println("Ultima ocurrencia 'e' en cadena2: "+ultimaE);

        String cadena1Mayus = cadena1.toUpperCase();
        System.out.println("\ncadena1 en mayusculas: "+cadena1Mayus);

        String cadena2Minus = cadena2.toLowerCase();
        System.out.println("cadena2 en minusculas: "+cadena2Minus);

        boolean sonIguales = cadena1.equals(cadena2);
        System.out.println("\ncadena1.equals(cadena2): "+sonIguales);

        boolean sonIgualesIgnoreCase = cadena1.equalsIgnoreCase(cadena2);
        System.out.println("cadena1.equalsIgnoreCase(cadena2): "+sonIgualesIgnoreCase);

        String concatenada = cadena1.concat(" ").concat(cadena2);
        System.out.println("\nConcatenacion (cadena1 + cadena2): "+concatenada);

        boolean contieneEsta = cadena1.contains("esta");
        System.out.println("\ncadena1 contiene la sub-cadena \"esta\": "+contieneEsta);

        String subCadena = cadena1.substring(0, 6);
        System.out.println("Sub-cadena de cadena1 [0-6]: "+subCadena);

        String cadenaReemplazada = cadena1.replace('a', 'i');
        System.out.println("\ncadena1 con 'a' reemplazada por 'i': "+cadenaReemplazada);
    }

    public static void mostrarCadena(String etiqueta, String texto) {
        System.out.println(etiqueta + ": " + texto);
    }
    
}
