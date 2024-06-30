public class App {
    public static void main(String[] args) throws Exception {
        Macaco macaco = new Macaco();
        macaco.alimentar();
        macaco.setEstahPendurado(true);
        System.out.println(macaco.isEstahPendurado());


    }
}
