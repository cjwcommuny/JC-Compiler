class ComplexOperation {
    class Complex {
        int real;
        int imagine;
    }

    void main(String[] args) {

    }

    void test() {
        Complex c1 = new Complex();
        c1.real = 3;
        c1.imagine = 4;
        Complex c2 = new Complex();
        c2.real = 6;
        c2.imagine = 8;
        printComplex(add(c1, c2));
        System.out.print("\n");
        printComplex(sub(c1, c2));
        System.out.print("\n");
        printComplex(mul(c1, c2));
        System.out.print("\n");
        printComplex(div(c1, c2));
        System.out.print("\n");
    }
    
    void printComplex(Complex c) {
        System.out.print(c.real);
        
        if (c.imagine > 0) {
            System.out.print("+");
            System.out.print(c.imagine);
            System.out.print("i");
        } else if (c.imagine < 0) {
            System.out.print(c.imagine);
            System.out.print("i");
        }
        
    }
    
    
    Complex add(Complex c1, Complex c2) {
        Complex c = new Complex();
        c.real = c1.real + c2.real;
        c.imagine = c1.imagine + c2.imagine;
        return c;
    }
    

    Complex sub(Complex c1, Complex c2) {
        Complex c = new Complex();
        c.real = c1.real - c2.real;
        c.imagine = c1.imagine - c2.imagine;
        return c;
    }

    Complex mul(Complex c1, Complex c2) {
        //(c11+c12i) * (c21+c22i)
        Complex c = new Complex();
        c.real = c1.real * c2.real - c1.imagine * c2.imagine;
        c.imagine = c1.real * c2.imagine + c1.imagine * c2.real;
        return c;
    }

    Complex div(Complex c1, Complex c2) {
        //(c11+c12i) / (c21+c22i)
        Complex c3 = new Complex();
        c3.real = c2.real;
        c3.imagine = -c2.imagine;
        int denominator = mul(c2, c3).real;
        Complex c = mul(c1, c3);
        c.real = c.real / denominator;
        c.imagine = c.imagine / denominator;
        return c;
    }
}