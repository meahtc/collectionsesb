package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.NameByLast;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;
import edu.ti.caih313.collections.dataobj.Name;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPersonDemo
{
    public static void main(String... args)
    {
        PersonSortable nameArray[] = {
                new PersonSortable(new Name("John", "Smith"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Karl", "Ng"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Jeff", "Smith"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Tom", "Rich"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Bob", "Smith"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Jane", "Doe"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Tony", "Stark"), Person.Gender.MALE, 20),
                new PersonSortable(new Name("Bo", "Peep") ,Person.Gender.MALE, 20),
        };

        List<PersonSortable> nameList = Arrays.asList(nameArray);
        PrintGeneric<PersonSortable> nameSortDemo = new PrintGeneric<>();
        nameSortDemo.printCollection(nameList);
        Collections.sort(nameList);
        System.out.print("\n");
        System.out.println("Print sorted nameList.");
        nameSortDemo.printCollection(nameList);
    }
}