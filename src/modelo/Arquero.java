
package modelo;

import pfed.IConstants;

public class Arquero extends Personaje implements IConstants{
    
    public Arquero() {
        super(ENERGIA_PERSONAJES);
        this.ataque = ATAQUE_ARQUERO;
        this.tiempoAtaque = TIEMPO_ATAQUE_ARQUERO;
    }
    
}
