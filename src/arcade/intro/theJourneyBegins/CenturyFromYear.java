package arcade.intro.theJourneyBegins;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(centuryFromYear(1999));
    }

    public static int centuryFromYear(int year) {
        if (year % 100 != 0)
            return year / 100 + 1;
        else
            return year / 100;
    }
}
