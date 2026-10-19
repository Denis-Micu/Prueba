package hilos;
public class TareaLarga{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Comienza aqui");
        realizarTarea();
        System.out.println("main puede continuar");
    }
        public static void realizarTarea()throws InterruptedException{
            for(int paso = 1; paso <=5;paso++){
                System.out.println("Procesando paso" + paso);
            Thread.sleep(1000);
        }
    }
}