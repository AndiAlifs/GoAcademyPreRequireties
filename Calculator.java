public class Calculator {
    private double result;

    public void print(){
        System.out.printf("%.1f%n",this.result);
    }

    public Calculator() {
        this.result = 0.0;
    }
    
    public void add(int x){
        this.result += x;
        print();
    }

    public void subtract(int x){
        this.result -= x;
        print();
    }

    public void divide(int x){
        if(x == 0){
            this.result = 0;
            print();
        } else {
            this.result /= x;
            print();
        }
    }

    public void multiply(int x){
        this.result *= x;
        print();
    }

    public void cancel(){
        result = 0;
        print();
    }
}