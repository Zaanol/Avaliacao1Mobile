/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    private Carta cartaVirada;

    public Truco() {
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador();
        this.baralho = new Baralho();
        this.cartaVirada = new Carta();
    }

    private void embaralhaCartas(){
        this.baralho.embaralhar();
    }

    private void distribuiMaos(){
        for (int i = 0; i < 3; i++) {
            jogador1.recebeCarta(this.baralho.distribuir());
            jogador2.recebeCarta(this.baralho.distribuir());
        }
    }

    private inicializaManilha(){
        this.cartaVirada = this.baralho.distribuir();
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }    
}
