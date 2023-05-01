public class App {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("ArrayList Capacity : " + list.getCapacity() + " Number of Elements in ArrayList : " + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList Capacity : " + list.getCapacity() + " Number of Elements in ArrayList : " + list.size());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("ArrayList Capacity : " + list.getCapacity() + " Number of Elements in ArrayList : " + list.size());
    
        
        MyList<Integer> list2 = new MyList<>(); 
        list2.add(10); 
        list2.add(20); 
        list2.add(30); 
        System.out.println("Element at 2nd Index : " + list2.get(2)); 
        list2.remove(2); 
        list2.add(40); 
        list2.set(0, 100); 
        System.out.println("Element at 2nd Index : " + list2.get(2));
        System.out.println(list2.toString());
    
        MyList<Integer> list3 = new MyList<>();
        System.out.println("MyList is : " + (list3.isEmpty() ? "Empty" : "Full"));
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);

        System.out.println("MyList is : " + (list3.isEmpty() ? "Empty" : "Full"));

        System.out.println("Index : " + list3.indexOf(20));

        System.out.println("Index :" + list3.indexOf(100));

        System.out.println("Index : " + list3.lastIndexOf(20));

        Object[] array = list3.toArray();
        System.out.println("First element of Object array : " + array[0]);

        MyList<Integer> mySublist = list3.sublist(0, 3);
        System.out.println(mySublist.toString());

        System.out.println("Is 20 in MyList? : " + list3.contains(20));
        System.out.println("Is 120 in MyList? : " + list3.contains(120));

        list3.clear();
        System.out.println(list3.toString());

    }
}
