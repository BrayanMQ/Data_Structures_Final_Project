
package modelo;

public abstract class Personaje {
    protected int ataque;
    protected double tiempoAtaque; 
    protected int energia;

    public Personaje(int energia) {
        this.energia = energia;
    } 
    
}
