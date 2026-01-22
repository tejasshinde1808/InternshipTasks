class InvalideAgeException extends Exception{
    InvalideAgeException(String msg){
        super(msg);
    }
}
public class CustomExceptionEx {
        static void validate(int age) throws InvalideAgeException{
            if (age<18)
                throw new InvalideAgeException("Age is invalid");
            else
                System.out.println("valid age");
        }
    public static void main(String[] args) {
        try{
            validate(16);
        }catch(InvalideAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
