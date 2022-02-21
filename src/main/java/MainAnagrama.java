public class MainAnagrama {
    public static void main(String[] args) {
        /**
         * 1 repticao A ok
         * 1 repetição n
         * 1 an -> an ok
         * 1 an -> an
         */
        Anagrama anagrama = new Anagrama("afgatha");

        System.out.println(anagrama.gerar());
    }
}
