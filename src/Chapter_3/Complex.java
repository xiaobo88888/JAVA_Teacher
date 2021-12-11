package Chapter_3;

public class Complex {
    private int realPart;
    private int imaginPart;

    /**
     * 两个Complex对象相加，返回和
     * @param a
     * @return
     */
    public Complex ComplexAdd(Complex a){
        this.realPart += a.getRealPart();
        this.imaginPart += a.getImaginPart();
        return this;
    }
    
    public Complex() {
        this.realPart = 0;
        this.imaginPart = 0;
    }

    public Complex(int realPart, int imaginPart) {
        this.realPart = realPart;
        this.imaginPart = imaginPart;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginPart() {
        return imaginPart;
    }

    public void setImaginPart(int imaginPart) {
        this.imaginPart = imaginPart;
    }

    @Override
    public String toString() {
        if(this.realPart == 0 && this.imaginPart != 0){
            return this.imaginPart + "i";
        }else if(this.imaginPart == 0){
            return String.valueOf(this.realPart);
        }else{
            return this.realPart + "+" + this.imaginPart + "i";
        }
    }
}
