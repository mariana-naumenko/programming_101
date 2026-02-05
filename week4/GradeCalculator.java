public class GradeCalculator {
    public static String getGrade(int score){
        switch (score / 10) {
            case 10: 
                return "A";            
            case 9:  
                return "A";
            case 8:  
                return "B";
            case 7:  
                return "C";
            case 6:  
                return "D";
            default: 
                return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(85));  
        System.out.println(getGrade(92));  
        System.out.println(getGrade(58));  
    }
}
