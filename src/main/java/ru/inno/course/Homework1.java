package ru.inno.course;

public class Homework1 {
    public static void main(String[] args) {

        String myStr = " Строка из 24 символов. ";
        String emptyStr = "";
        String blankStr = "\u0009";

//        .length() - возвращает количество символов строки в кодировке UTF-16.
        int myStrLength = myStr.length();
        System.out.println("The length of myStr is: " + myStrLength);

//        .isEmpty() проверяет является ли строка пустой или содержит значение null.
        boolean myStrEmpty = myStr.isEmpty();
        System.out.println("Is myStr empty? " + myStrEmpty);
        boolean emptyStrEmpty = emptyStr.isEmpty();
        System.out.println("Is emptyStr empty? " + emptyStrEmpty);

//        .isBlank() проверяет является ли строка whitespace, пустотой или null'ом.
//        A character is a Java whitespace character if and only if it satisfies one of the following criteria: https://docs.oracle.com/javase/6/docs/api/java/lang/Character.html?is-external=true#isWhitespace(char)
        boolean myStrBlank = myStr.isBlank();
        System.out.println("Is myStr blank? " + myStrBlank);
        boolean blankStrBlank = blankStr.isBlank();
        System.out.println("Is blankStr blank? " + blankStrBlank);

//        .substring(int beginIndex, int endIndex) возвращает подстроку, заданную начальным и конечным номерами символов. Первый символ входит в подстроку, а последний не входит, отсчет от 0.
        String myStrSub = myStr.substring(1, 23);
        System.out.println("The result of .substring method: " + "\"" + myStrSub + "\"");

//        .indexOf(String str) возвращает индекс с отсчетом от нуля первого вхождения значения указанной строки в исходной строке.
        int myStrIndexOf = myStr.indexOf("24");
        System.out.println("Begin index of substring '24' in myStr is: " + myStrIndexOf);

//        .lastIndexOf(String) возвращает позицию индекса с отсчетом от нуля последнего вхождения указанной подстроки в исходной строке.
        int myStrLastIndexOf = myStr.lastIndexOf(" ");
        System.out.println("Last index of substring ' ' in myStr is: " + myStrLastIndexOf);

//        .toLowerCase() переводит в нижний регистр символы исходной строки.
        String lowerCaseStr = myStr.toLowerCase();
        System.out.println("The result of .toLowerCase method: " + "\"" + lowerCaseStr + "\"");

//        .toUpperCase() переводит в верхний регистр символы исходной строки.
        String upperCaseStr = myStr.toUpperCase();
        System.out.println("The result of .toUpperCase method: " + "\"" + upperCaseStr + "\"");

//        .replace(String, String) возвращает новую строку, в которой все вхождения заданной строки в исходной строке заменены другой заданной строкой.
        String replasedStr = myStr.replace("С", "$");
        System.out.println("The result of .replace method: " + "\"" + replasedStr + "\"");

//        .startsWith(String) определяет совпадает ли начало исходной строки с указанной строкой.
        boolean startsWithMethodResult = myStr.startsWith(" ");
        System.out.println("The result of .startsWith method: " + startsWithMethodResult);

//        .endsWith(String) определяет совпадает ли конец исходной строки с указанной строкой.
        boolean endsWithMethodResult = myStr.endsWith(".");
        System.out.println("The result of .endsWith method: " + endsWithMethodResult);

//        .repeat(int) возвращает новую строку, представляющую собой конкатенацию исходной строки, повторенной n раз.
        String myStrRepeat = myStr.repeat(2);
        System.out.println("The result of .repeat method: " + "\"" + myStrRepeat + "\"");

//        .contains(String) возвращает значение, указывающее, встречается ли указанная подстрока внутри исходной строки. Регистр учитывается.
        boolean containsMethodResultFirst = myStr.contains("Строка");
        System.out.println("First result of .contains method: " + containsMethodResultFirst);
        boolean containsMethodResultSecond = myStr.contains("строка");
        System.out.println("Second result of .contains method: " + containsMethodResultSecond);

//        .concat(String) объединяет строки, путем добавления одной строки в конец к другой.
        String concatStringWithMyStr = myStr.concat("+ 13 символов");
        System.out.println("The result of .concat method: " + "\"" + concatStringWithMyStr + "\"");

//        .trim() возвращает копию исходной строки с пропущенными начальными и конечными пробелами.
        String trimStr = myStr.trim();
        System.out.println("The result of .trim method: " + "\"" + trimStr + "\"");
    }
}