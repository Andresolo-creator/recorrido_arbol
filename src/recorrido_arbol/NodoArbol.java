package recorrido_arbol;


public class NodoArbol<T> {
    private T dato;
    private NodoArbol [] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }

    public T getDato() {
        return dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }
    
    
}
