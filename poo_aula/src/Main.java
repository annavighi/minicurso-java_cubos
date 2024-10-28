//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro jaguar = new Carro();
        jaguar.modelo = "F-Pace";
        jaguar.marca = "Jaguar";
        jaguar.ano = 2025;
        jaguar.cor = "azul";

        System.out.println("Vende-se");
        System.out.println(jaguar.modelo);
        System.out.println(jaguar.cor);
    }
}