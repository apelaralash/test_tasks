package task_1;

import java.util.Scanner;

import static task_1.Functions.countOfTriples;

/* Уважаемые организаторы! Я не стала добавлять обработку ошибок (если об этом не сказано),
 * работу программы, пока ее не завершит пользователь, и другие возможности в своих решениях,
 * которые четко не прописаны в условиях заданий. Это распространяется на все задания.
 * Программа работает с числами, пробелами и латинским алфавитом*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = scanner.nextLine();

        System.out.println("There are " + countOfTriples(str) + " triples in the string.");
    }
}
