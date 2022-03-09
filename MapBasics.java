import java.util.*;

class Books {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books [id=" + id + ", name=" + name + ", author=" + author +",Publisher=" + publisher+",Quantity"+quantity +" ]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class MapBasics {
    public static void main(String[] args) {

        Books b1 = new Books(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Books b2 = new Books(233, "Operating System", "Galvin", "Wiley", 6);
        Books b3 = new Books(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Books b4 = new Books(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);

        HashMap<Integer, Books> map=new HashMap<Integer, Books>();

        map.put(121,b1);
        map.put(233,b2);
        map.put(101,b3);
        map.put(121,b4);


        System.out.println("Printing objects:");
        for(Map.Entry<Integer, Books> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for(Map.Entry<Integer, Books> entry : map.entrySet()){

            Books temp=entry.getValue();
            temp.quantity=temp.quantity*2;
            map.put(entry.getKey(),temp);
        }
         System.out.println("Printing after double:");
         for(Map.Entry<Integer, Books> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        merge(map);
    }

    private static void merge(HashMap<Integer, Books> map) {

        System.out.println("After Merge:");
        map.merge(233, map.get(233), (oldBook, newBook) -> {
            newBook.publisher += " USA";
            return newBook;
        });
        System.out.println(map.get(233));
        
    }
}