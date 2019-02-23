package CollectionsAndDates.Question5;

import CollectionsAndDates.Question4.Employee;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        if((double)s1.getScore()==(double)s2.getScore())
        {
            return s1.getName().compareTo(s2.getName());
        }
        else
        return (s1.getScore().compareTo(s2.getScore()));
    }
}
