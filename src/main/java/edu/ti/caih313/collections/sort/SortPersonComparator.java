package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPersonComparator
{
    public static void main(String... args) {

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
        PrintGeneric<PersonSortable> sortPersonComparatorDemo = new PrintGeneric<>();
        sortPersonComparatorDemo.printCollection(nameList);

        Comparator<PersonSortable> personByAgeGenderName = new Comparator<PersonSortable>() {
            @Override
            public int compare(PersonSortable personSortable, PersonSortable t1) {
                return 0;
            }

            public int compare(Person personOne, Person personTwo) {
                int compare;
                if (personOne.getAge() == personTwo.getAge()) {
                    compare = 0;
                } else if (personOne.getAge() > personTwo.getAge()) {
                    compare = -1;
                } else {
                    compare = 1;
                }
                if(compare == 0) {
                    if (personOne.getGender() == personTwo.getGender()) {
                        compare = 0;
                    } else if (personOne.getGender() == Person.Gender.MALE) {
                        compare = 1;
                    } else {
                        compare = -1;
                    }
                }
                if (compare == 0)
                {
                    compare = personOne.getName().toString().compareTo(personTwo.getName().toString());
                }
                return compare;
            }
        };

        Collections.sort(nameList, personByAgeGenderName);
        System.out.print("\n");
        System.out.println("Print sorted by age, gender, and name.");
        sortPersonComparatorDemo.printCollection(nameList);
    }
}