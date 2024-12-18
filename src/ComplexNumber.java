class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на одинаковые ссылки
        if (obj == null || getClass() != obj.getClass()) return false;

        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(real, other.real) == 0 &&
                Double.compare(imaginary, other.imaginary) == 0;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
