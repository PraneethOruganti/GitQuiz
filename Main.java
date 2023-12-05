public class Main{

    public Main()
    {

    }

    public static void main(String[] args)
    {
        Adder adder = (n1, n2) -> {
            int total = 0; 
            while(n1 <= n2)
            {
                total+=n1; 
                n1++; 
            }
            return total; 
        };

        System.out.print(adder.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    }
    
}
