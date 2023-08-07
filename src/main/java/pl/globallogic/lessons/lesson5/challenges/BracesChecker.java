package pl.globallogic.lessons.lesson5.challenges;

public class BracesChecker {
    public static void main(String[] args) {
        String source = "({()})";
        System.out.println(String.format("Is '%s' valid: %s", source, validate(source)));

    }
    private static boolean validate(String source){
        int openBracesCounter = 0;
        if(source==""){
            return false;
        }
        for(char brace : source.toCharArray()){
            if(brace == '{'|| brace=='['|brace=='('){
                openBracesCounter++;
            }else{
                openBracesCounter--;
            }
        }
        return openBracesCounter == 0;
    }
}
