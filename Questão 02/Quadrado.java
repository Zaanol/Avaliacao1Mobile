/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        return 2.0 * (this.lado + this.lado);
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
}