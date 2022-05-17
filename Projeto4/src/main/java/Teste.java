public class Teste {
    public static void main(String[] args) {
        InteiroSet set1 = new InteiroSet();
        InteiroSet set2 = new InteiroSet();

        set1.insertElement(0);
        set1.insertElement(2);
        set1.insertElement(8);
        System.out.println("After set1.insertElement(10), set1 = "
                + set1.insertElement(10));
        set1.insertElement(4);
        set1.insertElement(6);
        set1.insertElement(10);
        set1.insertElement(100);
        set1.insertElement(12);
        set1.insertElement(95);

        set2.insertElement(0);
        set2.insertElement(3);
        set2.insertElement(6);
        set2.insertElement(9);
        set2.insertElement(12);

        System.out.println("default InteiroSet is = " + (new InteiroSet()));
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set1.union(set2) = " + set1.union(set2));
        System.out.println("set1.intersection(set2) = " + set1.intersection(set2));
        System.out.println("set1.deleteElement(2) = " + set1.deleteElement(2));
        System.out.println("set1.isEqualTo(set1) = " + set1.isEqualTo(set1));
        System.out.println("set1.isEqualTo(set2) = " + set1.isEqualTo(set2));
    }
}
