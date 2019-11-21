
package modelo;

import pfed.IConstants;

public class Golpeador extends Personaje implements IConstants{
    
    public Golpeador() {
        super(ENERGIA_PERSONAJES);
        this.ataque = ATAQUE_GOLPEADOR;
        this.tiempoAtaque = TIEMPO_ATAQUE_GOLPEADOR;
    }
    
}
