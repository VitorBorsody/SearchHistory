//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        search.push("Algoritmos de ordenação");
        search.push("Estrutura de dados");
        search.push("Padrões de projeto em engenharia de software");
        search.push("Métodos ágeis para gerenciamento de projetos");
        search.push("Revisão de cálculo para engenheiros");
        search.push("Design de banco de dados relacional");
        search.displaySearches();
        search.pop();
        System.out.println(" ");
        search.displaySearches();
        System.out.println(" ");
        search.displayLastSearch();
        search.IsHistoryNull();
        search.displayTotalSearches();
    }
}