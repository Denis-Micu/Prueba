public class ProgramaPrincipal2 {
    public static void main(String[] args) {
        Thread hiloAscendente = new Thread(new CuentaAscendente(),"ascendente");
        Thread hiloDescendente = new Thread(new CuentaDescendente(),"descendiente");

        hiloAscendente.start();
        hiloDescendente.start();

        System.out.println("El jilo main continua");
    }

    static class CuentaAscendente implements Runnable{
        @Override 
        public void run(){
            for(int i = 1;i <=5;i++){
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }

    static class CuentaDescendente implements Runnable {
        @Override
        public void run() {
            for (int i = 5; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
}
