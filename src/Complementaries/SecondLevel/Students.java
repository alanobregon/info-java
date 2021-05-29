package Complementaries.SecondLevel;

import java.util.ArrayList;
import java.util.List;

/**
 * Cargar un arrayList con 12 nombres de estudiantes (String),
 * luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */
public class Students {
    public static void main(String[] args) {
        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Susana Apolônia");
        studentsList.add("Philemon Gerasimos");
        studentsList.add("Agathangelos Sosigenes");
        studentsList.add("Sophia Achinoam");
        studentsList.add("Rupa Erland");
        studentsList.add("Ganesha Timuçin");
        studentsList.add("Savitr Andreas");
        studentsList.add("Adrastos Didacus");
        studentsList.add("Lyubov Hooda");
        studentsList.add("Nina Godiva");
        studentsList.add("Anastasia Guido");
        studentsList.add("Barbe Murphy");

        List<String> firstCourse = studentsList.subList(0,4);
        List<String> secondCourse = studentsList.subList(4,8);
        List<String> thirdCourse = studentsList.subList(8, studentsList.size());

        System.out.println("Primer curso");
        for (String student : firstCourse) {
            System.out.println(student);
        }

        System.out.println("\nSegundo curso");
        for (String student : secondCourse) {
            System.out.println(student);
        }

        System.out.println("\nTercer curso");
        for (String student : thirdCourse) {
            System.out.println(student);
        }
    }
}
