//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var user = new User(); //reference- class-n memory-de olan address-i
        user.name = "Kamran";
        user.surname = "Asadov";

        var user1 = user;//reference-nin break(qirilma) olunmasi

        //Pass by value
        var a = 5; //Primitiv type-lar ozunde referans saxlamir. Yalniz deyer saxlayir
        addition(a);
        System.out.println(a);

        int[] arr = {1, 2, 3};//Array-lar ozunde deyer yox referans saxlayir. Ona gorede metod icerisinde 0-ci index-n deyeri artdi
        addition(arr);
        System.out.println(arr[0]);
    }

    public static void addition(int x) {
        x++;
    }

    public static void addition(int[] x) {
        x[0]++;
    }
}