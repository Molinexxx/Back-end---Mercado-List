package mercado;

import java.text.*;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utilitarios {

    // Formato de data padrão: dd/MM/yyyy
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // Formato de moeda padrão: R$ 1.234,56
    static NumberFormat nf = new DecimalFormat(
            "R$ #,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR"))
    );

    /**
     * Converte uma data para String no formato dd/MM/yyyy
     * @param data Data a ser formatada
     * @return String da data formatada
     */
    public static String dataParaDouble(Date data) {
        return Utilitarios.sdf.format(data);
    }

    /**
     * Converte um valor double para String formatada em moeda
     * @param valor Valor a ser formatado
     * @return String formatada (R$ 0,00)
     */
    public static String doubleParaString(Double valor) {
        return Utilitarios.nf.format(valor);
    }

    /**
     * Converte uma String formatada em moeda para Double
     * @param valor String com valor monetário
     * @return Double equivalente, ou null se não for possível converter
     */
    public static Double stringParaDouble(String valor) {
        try {
            return (Double) Utilitarios.nf.parse(valor);
        } catch (ParseException e) {
            return null; // Retorna null caso não consiga converter
        }
    }

    /**
     * Pausa a execução do programa por alguns segundos
     * @param segundos Quantidade de segundos para pausar
     */
    public static void pausar(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            System.out.println("Erro ao pausar por " + segundos + " segundos");
        }
    }
}