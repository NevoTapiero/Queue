public class Main {
    public static void main(String[] args) {
        Queue<Double> myQ = new Queue<>();
        myQ.insert(2.5);
        myQ.insert(7.0);
        myQ.insert(3.8);
        myQ.insert(9.1);
        myQ.insert(4.4);
        myQ.insert(6.9);
        System.out.println(isInsideQueue(myQ,2.5));
        System.out.println(whatIsTheBiggest(myQ));
        //printMyQ(myQ);

    }

    public static void printMyQ(Queue<Double> q) {
        while (!q.isEmpty()) {
            System.out.println(q.head());
            q.remove();
        }
    }

    public static void emptyMyQ(Queue<Double> q) {
        while (!q.isEmpty()) {
            q.remove();
        }

    }

    public static boolean isInsideQueue(Queue<Double> lst1, Double num) {
        boolean flag = false;
        Queue<Double> secQ = new Queue<>();
        while (!lst1.isEmpty()) {
            if (lst1.head() == num)
                flag = true;
            secQ.insert(lst1.head());
            lst1.remove();
        }
        while (!secQ.isEmpty()) {
            lst1.insert(secQ.head());
            secQ.remove();
        }
        return flag;
    }

    public static Double whatIsTheBiggest(Queue<Double> lst1) {
        Double biggest = 0.0;
        Queue<Double> secQ = new Queue<>();
        while (!lst1.isEmpty()) {
            if (biggest < lst1.head())
                biggest = lst1.head();
            else
                secQ.insert(lst1.head());
            lst1.remove();
        }
        while (!secQ.isEmpty()) {
            lst1.insert(secQ.head());
                secQ.remove();
        }
        return biggest;
    }
}