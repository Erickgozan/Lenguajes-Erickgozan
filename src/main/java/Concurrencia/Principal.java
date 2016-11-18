
package Concurrencia;

public class Principal implements Runnable{
    /*segunda forma de crear threads implementando 
    la interfaz runable usando polimorfismo*/
    public static void main(String[] args){
        Runnable r = new Principal();
        Thread t1 = new Thread();
        t1.setName("Juan");
        Thread t2 = new Thread();
        t2.setName("Ana");
       // t1.start();
       //t2.start();
       
       //tercera form usando clases anonimas
       
       Thread t3 = new Thread(new Runnable(){
            
           @Override
            public void run() {
                System.out.print("Soy un backgroud tread");
            }
           
       });
       t3.start();
    }

    @Override
   public void run(){
      
  if("juan".equals(Thread.currentThread().getName())){
          System.out.println("Es hombre");
      }
      else 
          System.out.println("Es mujer");
    }
     
   }
