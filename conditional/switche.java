public class switche {
    public static void main(String[] args) {
        char ch = 'b'; 
        switch(ch){ /*The switch statement executes a matching case based on the given value */
            case 'a':
            System.out.println("coke");
            break;
            case 'b':
            System.out.println("pizza");
            break;
            case 'c':
            System.out.println("burger");
            break;
            default:
            System.out.println("bye");
            break;
        }
    }
    
}
