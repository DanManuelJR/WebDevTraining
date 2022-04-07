import java.util.Scanner;
class Arrays {

    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        int count;
        String[] names = new String[5];

        for(count = 0; count < names.length; count++)
        {
            System.out.println("Enter a name");
            names[count] = name.nextLine();
        }

        for(count = 0; count < names.length; count++){
            System.out.println("My name is " + names[count]);
        }
        name.close();
    }
    
}
