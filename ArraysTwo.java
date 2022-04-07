import java.util.Scanner;
class Arrays {

    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        int count;
        String[] names = new String[5];
        int[] age = new int[5];

        for(count = 0; count < names.length; count++)
        {
            System.out.println("Enter a name");
            if(count !=0){
                name.nextLine();
            names[count] = name.nextLine();

            System.out.println("Enter age");
            age[count] = age.nextInt();
        }

        for(count = 0; count < names.length; count++){
            System.out.println("My name is " + names[count]);
        }
        name.close();
    }
    
}
