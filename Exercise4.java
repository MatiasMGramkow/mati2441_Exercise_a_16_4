import java.util.Scanner;

public class Exercise4
    /*
    Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
            list of the last occurrence of that value, or 1 if the value is not found in the list. For example, if a variable list
        stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
        If the call had instead been list.lastIndexOf(3), the method would return –1.*/
{
    public class list
    {
        public int data;
        public list next;

        public list()
        {
            this(0, null);
        }

        public list(int data)
        {
            this(data, null);
        }

        public list(int data, list next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private list front ;

    public Exercise4()
    {
        front = null;
    }

    public void add (int value)
    {
        if (front == null)
        {
            front = new list(value);
        }
        else
        {
            list current = front;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new list (value);
        }
    }

    public String toString ()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            list current = front.next;

            while (current != null)
            {
                result = result + ", " + current.data;
                current = current.next;
            }
            result = result + "]";
            return result;
        }
    }

    public int lastIndex(int value)
    {
        int count = -1;
        int index = 0;
        list current = front;

        while (current != null)
        {
            if (current.data == value)
            {
                if (current.data == value)
                {
                    count = index;
                }
                index = index + 1;
                current = current.next;
            }
        }
            if (count >= 0)
            {
                return count;
            }
            else
            {
                return -1;
            }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Exercise4 liste1 = new Exercise4();

        System.out.println("Enter a number: ");
        int val = scanner.nextInt();

        while (val != -1)
        {
            liste1.add(val);
            System.out.println("Enter a number again");
            val = scanner.nextInt();
            if (val == -1)
            {
                break;
            }
        }
            System.out.println();
            System.out.println("Elementerne er således: ");
            String string = liste1.toString();
            System.out.println(string);

            System.out.println();
            System.out.println("Enter a value to find the last element in the list");
            int number = scanner.nextInt();
            int hehjeh = liste1.lastIndex(number);
            System.out.println("The last index is : " + hehjeh);
    }
}
