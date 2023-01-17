package test;

public class Main {
    public static void main(String[] args) {
        An obiectAn = new An("Informatica 3");
        Grupa primaGrupa = new Grupa("Grupa 1");
        Semigrupa primaSemigrupa = new Semigrupa("Semigrupa 1.1");
        primaSemigrupa.add(
                new Student("Popescu I", "popescu@acme.edu"),
                new Student("Ionescu E", "ionescu@acme.edu"));
        primaGrupa.add(primaSemigrupa);
        Semigrupa aDouaSemigrupa = new Semigrupa("Semigrupa 1.2");
        aDouaSemigrupa.add(
                new Student("Vasilescu I", "vasilescu@acme.edu"),
                new Student("Georgescu E", "georgescu@acme.edu")
        );
        primaGrupa.add(aDouaSemigrupa);
        obiectAn.add(primaGrupa, new Grupa("Grupa 2"));
        Visitor printVisitor = new PrintVisitor();
        obiectAn.accept(printVisitor);
    }
}