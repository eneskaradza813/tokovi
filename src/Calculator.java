
public class Calculator {
    
    
    public double operand1;
    public double operand2;
    public char operator;
    
    public double calculate(){
        double result;
        switch(this.operator){
            case '+':
                result = this.operand1 + this.operand2;
                break;
            case '-':
                result = this.operand1 - this.operand2;
                break;
            case '*':
                result = this.operand1 * this.operand2;
                break;
            case '/':
                result = this.operand1 / this.operand2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
    
    
}
