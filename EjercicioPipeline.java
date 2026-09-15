import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EjercicioPipeline {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Pipeline de PNL");
        System.out.print("Ingrese una frase o resena de texto: ");
        String textoOriginal = leer.nextLine();

        String textoNormalizado = normalizarTexto(textoOriginal);

        List<String> tokens = tokenizar(textoNormalizado);

        List<String> tokensFiltrados = filtrarStopWords(tokens);

        Map<String, Integer> bolsaDePalabras = construirBolsaDePalabras(tokensFiltrados);

        System.out.println("\nTexto original: ");
        System.out.println(textoOriginal);

        System.out.println("\nTexto normalizado: ");
        System.out.println(textoNormalizado);

        System.out.println("\nTokens depurados (sin stop words): ");
        System.out.println(tokensFiltrados);

        System.out.println("\nBolsa de palabras (frecuencia de terminos): ");
        for (Map.Entry<String, Integer> par : bolsaDePalabras.entrySet()) {
            System.out.println(par.getKey() + " -> " + par.getValue());
        }

        leer.close();
    }

    public static String normalizarTexto(String texto) {
        String minuscula = texto.toLowerCase();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < minuscula.length(); i++) {
            char c = minuscula.charAt(i);
            if (Character.isLetter(c) || c == ' ') {
                resultado.append(c);
            }
        }

        String textoLimpio = resultado.toString().trim().replaceAll(" +", " ");

        return textoLimpio;
    }

    public static List<String> tokenizar(String textoNormalizado) {
        List<String> tokens = new ArrayList<>();
        String[] palabras = textoNormalizado.split(" ");

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                tokens.add(palabra);
            }
        }
        return tokens;
    }

    public static List<String> filtrarStopWords(List<String> tokens) {
        String[] listaStopWords = {
            "el", "la", "los", "las", "de", "en", "y", "a", "es",
            "un", "una", "que", "por", "con", "para", "del", "se", "lo"
        };
        List<String> stopWords = Arrays.asList(listaStopWords);

        List<String> tokensFiltrados = new ArrayList<>();
        for (String token : tokens) {
            if (!stopWords.contains(token)) {
                tokensFiltrados.add(token);
            }
        }
        return tokensFiltrados;
    }

    public static Map<String, Integer> construirBolsaDePalabras(List<String> tokensFiltrados) {
        Map<String, Integer> bolsaDePalabras = new HashMap<>();

        for (String token : tokensFiltrados) {
            if (bolsaDePalabras.containsKey(token)) {
                int frecuenciaActual = bolsaDePalabras.get(token);
                bolsaDePalabras.put(token, frecuenciaActual + 1);
            } else {
                bolsaDePalabras.put(token, 1);
            }
        }
        return bolsaDePalabras;
    }
}