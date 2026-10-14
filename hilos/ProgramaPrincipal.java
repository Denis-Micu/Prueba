
public class ProgramaPrincipal{
    public static void main(String[] args) {
        Runnable tarea = new TareaPaso();
        Thread hilo = new Thread(tarea,"hilo-procesamiento");
        System.out.println("EL objeto Thread ya existe");
        System.out.println("Termina main");

        hilo.start();
        System.out.println("Hilo main terminando");
    }
}

class TareaPaso implements Runnable {
    @Override 
    public void run(){
         for(int paso = 1; paso <=5;paso++){
                System.out.println(Thread.currentThread().getName() + " - paso" + paso);
        }
    }
}
