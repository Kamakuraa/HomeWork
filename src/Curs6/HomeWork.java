package Curs6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //    1) scrieti o functie care primeste un sir de numere
        //    intregi si returneaza suma lor
        var listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var sum = 0;
        for (int number : listOfNumbers) {
            sum += number;
        }
        System.out.println(sum);

//        2) scrieti o functie care primeste un sir de numere
////        intregi si returneaza numarul de elemente impare

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

//        3) scrieti o functie care primeste un sir de
//         numere intregi si un alt numar intreg.
//        Returnati toate numerele mai mari decat numarul primit
        List<Integer> numbers = Arrays.asList(56, 7, 99, 11, 23, 2, 3, 4, 78);

        List<Integer> result = new ArrayList<>();
        for (Integer val : numbers) {
            if (val.intValue() > 5) {
                result.add(val);
                System.out.println(val);
            }
//        6) scrieti o functie care primeste
//        un string cu o fraza (mai multe propozitii despartite prin punct).
//        Printati fiecare propozitie pe o linie noua
            String myString = "It is a long established. Fact that a reader will be distracted by the readable. Content of a page when looking at its layout. The point of using Lorem. Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using. 'Content here, content here', making it look like readable English.";
            String[] splitString = myString.split("\\.");
            for (String s : splitString){
                System.out.println(s);
            }

        }
    }
}
