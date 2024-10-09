package pckg_intro;

import java.util.ArrayList;

public class AppIntro {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(100);
        list.add("Something");
        list.add(23.57);
        list.add(26111);
        list.add(new User("Zeki"));
        //ListElements(list);
        System.out.println(new User("Ime1"));
    }

    private static void ListElements(ArrayList lista){
        int lngth= lista.size();
        for (int k=0; k<lngth;k++){
            System.out.println("Element: " + lista.get(k));
        }
    }
}
