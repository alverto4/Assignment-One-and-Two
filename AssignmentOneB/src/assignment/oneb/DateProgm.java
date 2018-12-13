package assignment.oneb;

public class DateProgm {

    public static void main(String[] args)
    {
        Date today = new Date(2108,12,12);
        System.out.println(today.getDay());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        Date tomorow = today;
        tomorow.setDate(2018,12,13);
        System.out.println(tomorow.toString());

        Date birthDate = today;
        birthDate.setDay(23);
        birthDate.setMonth(11);
        birthDate.setYear(1996);
        System.out.println(birthDate.toString());

    }
}
