package CollectionsAndDates.Question5;

public class Student {
    private String name;
    private Double score;
    private Double age;

    Student(String name,Double age,Double score){
            this.name=name;
            this.age=age;
            this.score=score;
    }
    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public Double getAge() {
        return age;
    }
}
