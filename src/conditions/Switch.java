package conditions;

public class Switch {
    public static void main(String[] args) {
        int grade = 1;
        String strGrade = "";

        if (grade == 1) {
            strGrade = "Sehr Gut";
        } else if (grade == 2) {
            strGrade = "Gut";
        } else if (grade == 3) {
            strGrade = "Befriedigend";
        } else if (grade == 4) {
            strGrade = "Genügend";
        } else if (grade == 5) {
            strGrade = "Nicht Genügend";
        } else {
            strGrade = "nicht zulässig";
        }

        //switch (äquivalent)
        switch(grade) {
            case 1: strGrade = "Sehr Gut"; break;
            case 2: strGrade = "Gut"; break;
            case 3: strGrade = "Befriedigend"; break;
            case 4: strGrade = "Genügend"; break;
            case 5: strGrade = "Nicht Genügend"; break;
            default: strGrade = "nicht zulässig";
        }

        System.out.println(strGrade);

    }
}
