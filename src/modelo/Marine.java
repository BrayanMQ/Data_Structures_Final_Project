
package modelo;

import pfed.IConstants;

public class Marine extends Personaje implements IConstants{
    
    public Marine() {
        super(ENERGIA_PERSONAJES);
        this.ataque = ATAQUE_MARINE;
        this.tiempoAtaque = TIEMPO_ATAQUE_MARINE;
    }
    
}
