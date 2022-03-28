
public class Coffeeria {

    
    public static void main(String[] args){
        Coffeeria start = new Coffeeria();
        start.game();
    }
    
    public void game(){
        gameover gameover = new gameover();
        Customer Customer = new Customer();
        OrderChecker OrderChecker = new OrderChecker();
        int timeremaining = 120;
        
       while(timeremaining > 0){
           
           try{
            Thread.sleep(1000);
            }
            catch(InterruptedException ex){
            }
        System.out.println("Time remaining:" + timeremaining);
           timeremaining--;
       }
       //gameover();
       System.out.println("Game Over.");



    }

     
    






   


}
