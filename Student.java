public class Student {
        
        String name;
        double nota1;
        double nota2;
        double nota3;
        String msg;

        public String finalGrade(){
                
                double media = nota1 + nota2 +nota3;
                if (media<60){
                        msg = "Final Grade =" + media + ", == FAILED == " + "Missing " + (60-media) + " points"; 
                } else if (media >= 60){
                        msg = "Final Grade =" + media + " == PASS == ";
                }
                return msg;
        }
        
}
