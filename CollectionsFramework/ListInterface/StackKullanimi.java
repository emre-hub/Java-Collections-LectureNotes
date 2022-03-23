package CollectionsFramework.ListInterface;

import java.util.LinkedList;
import java.util.Stack;

public class StackKullanimi {
    public static void main(String[] args) {
        Stack<String> yigin = new Stack<>();
        yigin.add("Emre");
        yigin.add("Hasan");
        yigin.add("Ali");
        System.out.println(yigin);
        System.out.println(yigin.pop());
        System.out.println(yigin.peek()); //peek son elemanı gösterir ama yığından çıkarmaz
        System.out.println(yigin);
        System.out.println(yigin.push("Can"));
        System.out.println(yigin);
        System.out.println(yigin.search("Hasan"));
        System.out.println(yigin.empty());

        LinkedList<String> yigin2 = new LinkedList<>();
        yigin2.push("ali");
        yigin2.push("veli");
        yigin2.push("yigit");
        System.out.println(yigin2);
        yigin2.pop();
        System.out.println(yigin2);
    }
}
