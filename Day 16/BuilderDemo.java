class Student {
    int id;
    String name;
    String course;

    private Student(Builder b) {
        id = b.id;
        name = b.name;
        course = b.course;
    }

    static class Builder {
        int id;
        String name;
        String course;

        Builder setId(int id) {
            this.id = id;
            return this;
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        Student build() {
            return new Student(this);
        }
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Student s = new Student.Builder()
                .setId(1)
                .setName("Tejas")
                .setCourse("Java")
                .build();
        System.out.println(s.name);
    }
}
