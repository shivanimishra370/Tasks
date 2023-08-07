public class namedloop {
    public static void main(String[] args){
        outerloop:
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (i * j > 20) {
                System.out.println("Breaking out of outer loop");
                break outerloop;
            }
        }
    }
    
        }
    }
    
    

