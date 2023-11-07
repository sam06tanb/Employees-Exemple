package percentage;

public class Calc {
  private double percentage;

  public Calc(Double percentage) {
      this.percentage = percentage;
  }

public double calcularAumento(double salary) {
    double aumento = salary * (percentage / 100);
    return salary + aumento;
}






}
